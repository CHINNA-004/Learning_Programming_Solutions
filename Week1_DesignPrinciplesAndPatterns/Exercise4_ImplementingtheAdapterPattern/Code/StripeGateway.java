package Exercise4_ImplementingtheAdapterPattern.Code;

public class StripeGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Payment of $" + amountInDollars + " processed through Stripe.");
    }
}

