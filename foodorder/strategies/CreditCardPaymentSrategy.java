package strategies;

/**
 * CreditCardPaymentSrategy
 */
public class CreditCardPaymentSrategy implements PaymentStrategy {

    private String mobile;

    CreditCardPaymentSrategy(String mobile) {
        this.mobile = mobile;
    }

    public void pay(int total) {
        System.out.println("Paid ₹" + amount + " using UPI (" + mobile + ")");
    }
}