package zad02;

public class StocksMain {
    public static void main(String[] args) {
        Stocks stocks = new Stocks();

        AmazonObserver amazonObserver = new AmazonObserver(stocks);
        MicrosoftObserver microsoftObserver = new MicrosoftObserver(stocks);
        GoogleObserver googleObserver = new GoogleObserver(stocks);

        stocks.notifyObservers("Amazon", 73);
        stocks.notifyObservers("Google", 31);

    }
}
