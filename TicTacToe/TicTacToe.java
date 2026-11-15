package TicTacToe;

import java.util.*;

import TicTacToe.Observer.IObserver;
import TicTacToe.strategy.Rule;

public class TicTacToe {

    private Deque<Player> players;
    private Board board;
    private Rule rule;
    private List<IObserver> observers;
    private boolean gameOver;
    public TicTacToe(int size, Rule rule) {
        players = new ArrayDeque<>();
        board = new Board(size);
        this.rule = rule;
        this.observers = new ArrayList<>();
        this.gameOver = false;
    }

    public void addPlayer(Player p) {
        players.addLast(p);
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void notify(String msg) {
        for (IObserver observer : observers) {
            observer.update(msg);
        }
    }

    public void play() {
        if (players.size() < 2) {
            System.out.println("Need at least 2 players!");
            return;
        }

        notify("Tic Tac Toe Game Started!");

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            board.display();

            // Take out the current player from dequeue
            Player currentPlayer = players.peekFirst();
            System.out.print(currentPlayer.getName() + " (" + currentPlayer.getSymbol().getSymbol() 
                    + ") - Enter row and column: ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // check if move is valid
            if (rule.isValidMove(board, row, col)) {
                board.markCell(row, col, currentPlayer.getSymbol());
                notify(currentPlayer.getName() + " played (" + row + "," + col + ")");

                if (rule.checkWinCondition(board, currentPlayer.getSymbol())) {
                    board.display();
                    System.out.println(currentPlayer.getName() + " wins!");
                    currentPlayer.incrementScore();

                    notify(currentPlayer.getName() + " wins!");

                    gameOver = true;
                } else if (rule.checkDrawCondition(board)) {
                    board.display();

                    System.out.println("It's a draw!");
                    notify("Game is Draw!");

                    gameOver = true;
                } else {
                    // Move player to back of queue
                    players.removeFirst();
                    players.addLast(currentPlayer);
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

    }

}
