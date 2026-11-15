package TicTacToe;

import TicTacToe.Factory.TicTacToeFactory;
import TicTacToe.Observer.*;
public class Main {
    
    public static void main(String[] args) {
        
        TicTacToe ticTacToe = TicTacToeFactory.getGame("standard", 3);

        ticTacToe.addObserver(new ConsoleNotifier());

        ticTacToe.addPlayer(new Player(1,new Symbol('#'), "akshay"));
        ticTacToe.addPlayer(new Player(2,new Symbol('o'), "akshay1"));

        ticTacToe.play();
    }
}
