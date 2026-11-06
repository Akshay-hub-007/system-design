package ParkingLot;

public class CashPayment implements PaymentStrategy{
    
    public  CashPayment(double fee) {
        
    }

    public void processPayment(double fee) {
        System.out.println("Paid by Cash" + fee);
    }
}
