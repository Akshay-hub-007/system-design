package TicTacToe.Observer;

public class ConsoleNotifier implements IObserver {
    public ConsoleNotifier() {
        
    }
    public void update(String msg) {
        System.out.println("[Notification] " + msg);
    }
}