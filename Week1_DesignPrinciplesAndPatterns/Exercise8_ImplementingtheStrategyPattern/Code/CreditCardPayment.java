package Exercise8_ImplementingtheStrategyPattern.Code;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid RS " + amount + " using Credit Card: " + cardNumber);
    }
}

