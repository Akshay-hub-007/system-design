package paymentgateway.gateway;

import paymentgateway.banking.RazorPayBankingSystem;
import paymentgateway.modal.PaymentRequest;

public class RazorpayGateway extends PaymentGateway {
    
    public RazorpayGateway() {
        this.bankingSystem = new RazorPayBankingSystem();
    }

    @Override
    protected boolean validatePayment(PaymentRequest request) {
        System.out.println("[Paytm] Validating payment for " + request.getSender() + ".");
        if (request.getAmount() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    protected boolean initiatePayment(PaymentRequest request) {
        System.out.println("[Paytm] Initiating payment of " + request.getAmount()
                + " " + request.getCurrency() + " for " + request.getSender() + ".");
        return bankingSystem.processPayment(request.getAmount());
    }

    @Override
    protected boolean confirmPayment(PaymentRequest request) {
        System.out.println("[Paytm] Confirming payment for " + request.getSender() + ".");
        // Confirmation always succeeds in this simulation
        return true;
    }



}
