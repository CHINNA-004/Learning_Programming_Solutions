package Exercise8_ImplementingtheStrategyPattern.Code;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid RS " + amount + " using PayPal account: " + email);
    }
}
