import java.text.NumberFormat;
import java.util.Locale;

public class GooglePayProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        String formattedAmount = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        System.out.println("Processing GooglePay payment of " + formattedAmount);
        // Placeholder: Add GooglePay logic here
    }
}
