import java.text.NumberFormat;
import java.util.Locale;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        String formattedAmount = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        System.out.println("Processing PayPal payment of " + formattedAmount);
        // Placeholder: Add PayPal Logic here
    }
}
