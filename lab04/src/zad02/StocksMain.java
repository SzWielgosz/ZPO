package zad02;

public class StocksMain {
    public static void main(String[] args) {
        Stocks stocks = new Stocks();

        FirstCompany firstCompany = new FirstCompany("Amazon");

        SecondCompany secondCompany = new SecondCompany("Microsoft");

        ThirdCompany thirdCompany = new ThirdCompany("Google");

        stocks.registerObserver(firstCompany);
        stocks.registerObserver(secondCompany);
        stocks.registerObserver(thirdCompany);

        stocks.notifyObservers();


    }
}
