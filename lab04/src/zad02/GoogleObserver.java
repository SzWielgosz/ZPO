package zad02;

import java.util.Random;

public class GoogleObserver implements Observer, Display {
    private Subject stocksSubject;
    public String name;
    private double price;

    public GoogleObserver(Subject stocksSubject) {
        this.stocksSubject = stocksSubject;
        stocksSubject.registerObserver(this);
        this.name = "Google";
        this.price = 24.5;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void update(String name, double price) {
        if(this.name.equals(name)){
            this.price = price;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println(this.name + " " + this.price);
    }
}
