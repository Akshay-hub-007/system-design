package paymentgateway.modal;


public class PaymentRequest {

    private String sender;
    private String receiver;
    private double amount;
    private String currency;
    
    public PaymentRequest(String sender, String receiver,double amount,String currency) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }
    public String getSender() {
        return sender;
    }
    
    public String getReceiver() {
        return receiver;
    }

    public String getCurrency() {
         return  this.currency;
    }

}