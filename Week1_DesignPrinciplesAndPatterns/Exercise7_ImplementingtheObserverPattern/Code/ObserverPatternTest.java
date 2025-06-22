package Exercise7_ImplementingtheObserverPattern.Code;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stock = new StockMarket("ABC Corp");

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stock.registerObserver(mobileApp);
        stock.registerObserver(webApp);

        stock.setStockPrice(150.75);
        stock.setStockPrice(158.90);

        stock.removeObserver(webApp);
        stock.setStockPrice(162.30);
    }
}

