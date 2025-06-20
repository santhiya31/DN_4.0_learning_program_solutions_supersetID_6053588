package Week1_Design_Patterns_and_Principles.Exercise_7_ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        market.register(mobileApp);
        market.register(webApp);
        market.setStockPrice(150.75);
        market.setStockPrice(160.50);
    }
}
