package zad02;
import java.util.ArrayList;
import java.util.Random;

public class Stocks implements Subject{

    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String name, int price) {
        for(Observer observer: observers){
            observer.update(name, price);
        }
    }
}
