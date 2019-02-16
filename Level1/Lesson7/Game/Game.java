package Game;

import javax.swing.*;

public class Game {
    private GameBoard board;
    private GamePlayer [] gamePlayers = new GamePlayer[2];
    private int playerTurn = 0;

    public Game(){
        this.board = new GameBoard(this);
    }
    public void initGame(){
        gamePlayers[0] = new GamePlayer(true , '0');
        gamePlayers[1] = new GamePlayer(false, 'X');
    }
    void passTurn(){
        if (playerTurn == 0)
            playerTurn = 1;
        else
            playerTurn = 0;
    }
    GamePlayer getCurrentPlayer(){
        return  gamePlayers[playerTurn];
    }
    void showMessage(String messageText){
        JOptionPane.showMessageDialog(board,messageText);
    }
}
