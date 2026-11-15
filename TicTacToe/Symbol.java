package TicTacToe;

public class Symbol {
    char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public String toString() {
        return  this.symbol + " ";
    }


}
