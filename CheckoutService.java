public class CheckoutService {

    public void checkout(PaymentMode mode, double amount) {
        PaymentProcessor processor = PaymentProcessorFactory.getProcessor(mode);
        processor.process(amount);
    }
}
