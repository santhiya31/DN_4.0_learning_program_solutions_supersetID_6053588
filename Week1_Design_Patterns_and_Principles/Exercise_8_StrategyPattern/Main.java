package Week1_Design_Patterns_and_Principles.Exercise_8_StrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(500.00);
        context = new PaymentContext(new PayPalPayment("user1@example.com"));
        context.executePayment(300.00);
    }
}

