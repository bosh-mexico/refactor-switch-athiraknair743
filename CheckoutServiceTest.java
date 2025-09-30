import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CheckoutServiceTest {

    private PaymentProcessorFactory mockFactory;
    private CheckoutService checkoutService;
    private PaymentProcessor mockProcessor;

    @BeforeEach
    public void setup() {
        mockFactory = mock(PaymentProcessorFactory.class);
        mockProcessor = mock(PaymentProcessor.class);
        checkoutService = new CheckoutService(mockFactory);
    }

    @Test
    public void testCheckoutPayPal() {
        when(mockFactory.getProcessor(PaymentMode.PAYPAL)).thenReturn(mockProcessor);

        checkoutService.checkout(PaymentMode.PAYPAL, 100.0);

        verify(mockProcessor, times(1)).process(100.0);
    }

    @Test
    public void testCheckoutInvalidMode() {
        when(mockFactory.getProcessor(PaymentMode.UNKNOWN)).thenReturn(mockProcessor);

        checkoutService.checkout(PaymentMode.UNKNOWN, 50.0);

        verify(mockProcessor, times(1)).process(50.0);
    }
}
