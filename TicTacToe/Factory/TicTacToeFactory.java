package TicTacToe.Factory;

import TicTacToe.TicTacToe;
import TicTacToe.strategy.Rule;
import TicTacToe.strategy.StandardRule;

public class TicTacToeFactory {
    
    public static  TicTacToe getGame(String level,int size) {

        if (level.equals("standard")) {
            
            return new TicTacToe(size, new StandardRule());
        }
        return null;
    }
}
