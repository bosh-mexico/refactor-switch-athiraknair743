import java.text.NumberFormat;
import java.util.Locale;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        String formattedAmount = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        System.out.println("Processing Credit Card payment of " + formattedAmount);
        // Placeholder: Add Credit Card logic here
    }
}
