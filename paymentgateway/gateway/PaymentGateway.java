    package paymentgateway.gateway;

    import paymentgateway.banking.*;
import paymentgateway.modal.PaymentRequest;

    public abstract class PaymentGateway {

        protected Banking bankingSystem;

        public PaymentGateway() {
            this.bankingSystem = null;
        }

        public boolean processPayment(PaymentRequest request) {
            if (!validatePayment(request)) {
                System.out.println("[PaymentGateway] Validation failed for " + request.getSender() + ".");
                return false;
            }
            if (!initiatePayment(request)) {
                System.out.println("[PaymentGateway] Initiation failed for " + request.getSender() + ".");
                return false;
            }
            if (!confirmPayment(request)) {
                System.out.println("[PaymentGateway] Confirmation failed for " + request.getSender() + ".");
                return false;
            }
            return true;
        }

        protected abstract boolean validatePayment(PaymentRequest request);

        protected abstract boolean initiatePayment(PaymentRequest request);

        protected abstract boolean confirmPayment(PaymentRequest request);
    }