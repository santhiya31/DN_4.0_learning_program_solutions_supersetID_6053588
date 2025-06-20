package Week1_Design_Patterns_and_Principles.Exercise_7_ObserverPattern;

public interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

