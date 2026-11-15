package TicTacToe;

public class Player {
    
    private Symbol symbol;
    private String name;
    private int playerId;
    private int score;

    public Player(Symbol symbol,String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getScore() {
        return score;
    }

    
    public void incrementScore() { 
        score++;
    }   

}
