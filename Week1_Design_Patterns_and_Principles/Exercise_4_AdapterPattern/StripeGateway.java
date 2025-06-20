package Week1_Design_Patterns_and_Principles.Exercise_4_AdapterPattern;

public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}
