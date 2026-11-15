package TicTacToe.strategy;

import TicTacToe.Board;
import TicTacToe.Symbol;

public class StandardRule implements  Rule{
    @Override
    public boolean checkDrawCondition(Board board) {
        int size = board.getSize();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board.getCell(i, j) == board.getEmptyCell()) {
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public boolean checkWinCondition(Board board, Symbol symbol) {
         int size = board.getSize();
        
        for(int i = 0; i < size; i++) {
            boolean win = true;
            for(int j = 0; j < size; j++) {
                if(board.getCell(i, j) != symbol) {
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }
        
        for(int j = 0; j < size; j++) {
            boolean win = true;
            for(int i = 0; i < size; i++) {
                if(board.getCell(i, j) != symbol) {
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }
        
        boolean win = true;
        for(int i = 0; i < size; i++) {
            if(board.getCell(i, i) != symbol) {
                win = false;
                break;
            }
        }
        if(win) return true;
        
        win = true;
        for(int i = 0; i < size; i++) {
            if(board.getCell(i, size-1-i) != symbol) {
                win = false;
                break;
            }
        }
        return win;
    }

    @Override
    public boolean isValidMove(Board board, int row, int col) {
        
        return board.isCellEmpty(row, col);
    }

}
