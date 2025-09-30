public class PaymentProcessorFactory {

    public static PaymentProcessor getProcessor(PaymentMode mode) {
        switch (mode) {
            case PAYPAL:
                return new PayPalProcessor();
            case GOOGLEPAY:
                return new GooglePayProcessor();
            case CREDITCARD:
                return new CreditCardProcessor();
            default:
                return new UnsupportedPaymentProcessor();
        }
    }
}
