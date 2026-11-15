package TicTacToe.strategy;

import TicTacToe.Board;
import TicTacToe.Symbol;

public interface Rule {
    
    boolean isValidMove(Board board, int row, int col);
    boolean checkWinCondition(Board board, Symbol symbol);
    boolean checkDrawCondition(Board board);

}
