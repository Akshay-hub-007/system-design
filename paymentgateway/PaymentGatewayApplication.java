package paymentgateway;

import paymentgateway.controller.PaymentController;
import paymentgateway.enums.GatewayEnums;
import paymentgateway.modal.PaymentRequest;

public class PaymentGatewayApplication {
    
    public static void main(String[] args) {
        PaymentController controller = PaymentController.getInstance();
        PaymentRequest pr = new PaymentRequest("AKshay1","AKshay2",200.0,"INR");
        controller.handlePayment(GatewayEnums.PAYTM,pr);

        PaymentRequest pr1 = new PaymentRequest("AKshay1","AKshay2",300.0,"INR");
        controller.handlePayment(GatewayEnums.RAZOR,pr1);
        
        

    }
}
