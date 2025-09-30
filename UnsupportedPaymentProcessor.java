public class UnsupportedPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("❌ Error: Invalid or unsupported payment mode selected!");
    }
}
