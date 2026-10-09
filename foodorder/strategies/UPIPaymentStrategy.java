package strategies;

/**
 * UPIPaymentStrategy
 */
public class UPIPaymentStrategy implements PaymentStrategy {
    private String mobile;
    UPIPaymentStrategy(String mobile) {
        this.mobile = mobile;
    }

    public void pay(int total) {
        System.out.println("Paid ₹" + total + " using UPI (" + mobile + ")");
    }

}