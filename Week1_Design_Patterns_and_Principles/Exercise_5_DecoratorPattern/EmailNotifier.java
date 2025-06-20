package Week1_Design_Patterns_and_Principles.Exercise_5_DecoratorPattern;
public class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

