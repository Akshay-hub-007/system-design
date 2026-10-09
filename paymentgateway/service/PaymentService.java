package paymentgateway.service;

import paymentgateway.gateway.PaymentGateway;
import paymentgateway.modal.PaymentRequest;

public class PaymentService {
    
    PaymentGateway paymentGateway;

    public void setGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(PaymentRequest pr) {
        if (paymentGateway == null) {
            System.out.println("[PaymentService] No payment gateway selected.");
            return false;
        }
        return paymentGateway.processPayment(pr);
    }
}
