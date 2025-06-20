package Week1_Design_Patterns_and_Principles.Exercise_7_ObserverPattern;

public class WebApp implements Observer {
    public void update(double price) {
        System.out.println("Web App - Stock Price Updated: $" + price);
    }
}
