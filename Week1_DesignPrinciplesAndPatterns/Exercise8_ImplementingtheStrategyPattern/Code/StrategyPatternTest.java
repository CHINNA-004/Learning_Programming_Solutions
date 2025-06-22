package Exercise8_ImplementingtheStrategyPattern.Code;


public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234"));
        context.payAmount(250.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(120.00);
    }
}

