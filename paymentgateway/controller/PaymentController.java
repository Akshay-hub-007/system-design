package paymentgateway.controller;

import paymentgateway.enums.GatewayEnums;
import paymentgateway.factory.GatewayFactory;
import paymentgateway.gateway.PaymentGateway;
import paymentgateway.modal.PaymentRequest;
import paymentgateway.service.PaymentService;

public class PaymentController {
    
    private  static final  PaymentController paymentController = new PaymentController();

    private PaymentController() {

    }

    public static  PaymentController getInstance() {
        return paymentController;
    }
    
    public   boolean handlePayment(GatewayEnums type,PaymentRequest pr) {

        PaymentGateway pg = GatewayFactory.getInstance(type);
        PaymentService ps = new PaymentService();
        ps.setGateway(pg);

        return ps.processPayment(pr);
    }
}
