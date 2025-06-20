package Week1_Design_Patterns_and_Principles.Exercise_4_AdapterPattern;

public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}