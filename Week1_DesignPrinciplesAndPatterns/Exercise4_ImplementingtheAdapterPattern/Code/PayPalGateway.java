package Exercise4_ImplementingtheAdapterPattern.Code;

public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed through PayPal.");
    }
}
