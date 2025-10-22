package ua.edu.ucu.lab_7;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab_7.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.lab_7.payment.PayPalPaymentStrategy;

public class PaymentTests {
    @Test
    void testPayPalPayment() {
        PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
        assertDoesNotThrow(() -> paypal.pay(100.0));
    }

    @Test
    void testCreditCardPayment() {
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        assertDoesNotThrow(() -> creditCard.pay(150.0));
    }
}
