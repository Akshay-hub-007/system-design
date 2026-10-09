package paymentgateway.banking;

import java.util.Random;

public class PaytmBankingSystem implements Banking  {
    Random rand = new Random();
   public PaytmBankingSystem() {}

    @Override
    public boolean processPayment(double amount) {
        // Simulate 20% success
        int r = rand.nextInt(100);
        return r < 80;
    }
}
