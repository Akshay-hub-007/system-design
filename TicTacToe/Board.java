package TicTacToe;
import java.util.*;
public class Board {
    
    private List<Player> players;
    private int size;
    private List<List<Symbol>> board;
    private Symbol emptyCell;

    public  Board(int size) {
        players = new ArrayList<>();
        this.size = size;
        this.board = new ArrayList<>();

        emptyCell = new Symbol('-');

        for (int i = 0; i < size; i++) {
            board.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                board.get(i).add(emptyCell);
            }
        }
    }

    public boolean isCellEmpty(int r,int c) {
        if(r < 0 || r >= size || c < 0 || c >= size) {
            return false;
        }
        return board.get(r).get(c) == emptyCell;
    }

    public boolean markCell(int r,int c,Symbol mark) {
        
        if (!isCellEmpty(r, c)) return  false;

        board.get(r).set(c, mark);
        return true;
    }

    public void displayBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void play() {

    }
    
}
