package Week1_Design_Patterns_and_Principles.Exercise_8_StrategyPattern;

public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}

