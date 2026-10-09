package paymentgateway.banking;

import java.util.Random;

public class RazorPayBankingSystem implements Banking {
    Random rand = new Random();

    public RazorPayBankingSystem() {
    }

    @Override
    public boolean processPayment(double amount) {
        // Simulate 20% success~
        int r = rand.nextInt(100);
        return r < 90;
    }
}
