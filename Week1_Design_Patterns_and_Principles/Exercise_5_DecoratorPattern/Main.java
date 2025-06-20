package Week1_Design_Patterns_and_Principles.Exercise_5_DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier = new SMSNotifierDecorator(notifier);
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("New notification received!");
    }
}
