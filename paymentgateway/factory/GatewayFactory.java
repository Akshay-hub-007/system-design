package paymentgateway.factory;

import paymentgateway.enums.GatewayEnums;
import paymentgateway.gateway.PaymentGateway;
import paymentgateway.gateway.PaytmGateway;
import paymentgateway.gateway.ProxyPaymentGateway;
import paymentgateway.gateway.RazorpayGateway;

public class GatewayFactory {

    public static PaymentGateway getInstance(GatewayEnums type) {

        if (type.equals(GatewayEnums.PAYTM)) {
            PaytmGateway paytmGateway = new PaytmGateway();
            return new ProxyPaymentGateway(paytmGateway,  1);
        } else if (type.equals(GatewayEnums.RAZOR)) {
            RazorpayGateway razorpayGateway = new RazorpayGateway();
            return new ProxyPaymentGateway(razorpayGateway,3);
        } else {
            return null;
        }
    }
}
