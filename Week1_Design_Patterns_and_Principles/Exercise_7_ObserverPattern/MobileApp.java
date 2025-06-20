package Week1_Design_Patterns_and_Principles.Exercise_7_ObserverPattern;

public class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("Mobile App - Stock Price Updated: $" + price);
    }
}
