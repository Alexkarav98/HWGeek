package Game;

import javax.swing.*;

public class GameButton extends JButton {
    private int ButtonIndex;
    private GameBoard board;
     public GameButton(int gameButtonIndex,GameBoard currentBoard){
         ButtonIndex = gameButtonIndex;
         board = currentBoard;

         int rowNum = ButtonIndex / GameBoard.dimension;
         int cellNum = ButtonIndex % GameBoard.dimension;

         setSize(GameBoard.cellSize - 5 , GameBoard.cellSize - 5);
         addActionListener(new GameActionListener(rowNum,cellNum,this));
     }
     public GameBoard getBoard(){
         return board;
     }
}
