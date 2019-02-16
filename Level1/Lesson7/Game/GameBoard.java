package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JFrame {
    final static int dimension = 3;
    final static int cellSize = 150;
    private char [][] gameField;
    private GameButton [] gameButtons;

    final static char nullSymol = '\u0000';

    private Game game;

    public GameBoard(Game currentGame){
        this.game=currentGame;
        initField();
    }
    private void initField(){
        setBounds(cellSize * dimension , cellSize * dimension,400,300);
        setTitle("Крестики-Нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        JButton newGameButton = new JButton("Новая игра");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptyField();
            }
        });

        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(newGameButton);
        controlPanel.setSize(cellSize*dimension,150);

        JPanel gameFieldPanel = new JPanel();
        gameFieldPanel.setLayout(new GridLayout(dimension,dimension));
        gameFieldPanel.setSize(cellSize * dimension,cellSize * dimension);

        gameField = new char[dimension][dimension];
        gameButtons = new GameButton[dimension * dimension];

        for (int i = 0 ; i < (dimension * dimension); i++){
            GameButton fieldButton = new GameButton(i,this);
            gameFieldPanel.add(fieldButton);
            gameButtons[i]=fieldButton;
        }
        getContentPane().add(controlPanel , BorderLayout.NORTH);
        getContentPane().add(gameFieldPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    void emptyField(){
        for (int i = 0; i < (dimension * dimension); i ++){
            gameButtons[i].setText("");
            int x = 1 / GameBoard.dimension;
            int y = 1 / GameBoard.dimension;

            gameField[x][y] = nullSymol;
        }
    }
    Game getGame(){
        return game;
    }

    boolean isTurnable(int x, int y){
        boolean result = true;

        if (gameField[y][x] != nullSymol)
            result = false;

        return result;
    }
    void updateGameField(int x,int y){
        gameField[y][x] = game.getCurrentPlayer().getPlayerSign();
    }

    boolean checkWin(){
        boolean result = false;

        char playerSymbol = getGame().getCurrentPlayer().getPlayerSign();

        if (checkWinDiagonals(playerSymbol) || checkWinLanes(playerSymbol)){
            result = true;
        }
        return result;
    }

    private boolean checkWinDiagonals(char playerSymbol){
        boolean cols , rows, result;

        result = false;

        for (int col = 0 ; col < dimension; col++){
            cols = true;
            rows = true;

            for (int row = 0;row < dimension;row++) {
                cols &= (gameField[col][row] == playerSymbol);
                rows &= (gameField[row][col] == playerSymbol);
            }
            if (cols || rows){
                result = true;
                break;
            }
            if (result){
                break;
            }
        }
        return result;
    }
    private boolean checkWinLanes(char playerSymbol) {
        boolean cols, rows, result;

        result = false;

        for (int col = 0; col < dimension; col++) {
            cols = true;
            rows = true;

            for (int row = 0; row < dimension; row++) {
                cols &= (gameField[row][col] == playerSymbol);
                rows &= (gameField[col][row] == playerSymbol);
            }
            if (cols || rows) {
                result = true;
                break;
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    boolean isFull(){
        boolean result = true;
        for (int i = 0; i<dimension;i++){
            for (int j = 0; j<dimension;j++)
                if (gameField[i][j] == nullSymol)
                    result = false;
        }

        return result;
    }

    public GameButton getButton(int buttonIndex){
        return gameButtons[buttonIndex];
    }


}
