package Week1_Design_Patterns_and_Principles.Exercise_7_ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;
    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }
    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockPrice);
        }
    }
}
