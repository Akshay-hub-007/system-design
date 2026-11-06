package ParkingLot;

public class UPIPayment implements PaymentStrategy {
    
    public UPIPayment(double fee) {
        
    }

    public void processPayment(double fee) {
        System.out.println("Paid by UPI " + fee);
    }
}
