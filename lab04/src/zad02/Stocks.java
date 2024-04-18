package zad02;
import java.util.ArrayList;
import java.util.Random;

public class Stocks implements Subject{

    Random random = new Random();

    ArrayList<Observer> companies = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        companies.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        companies.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer company: companies){
            company.update(Math.round(random.nextDouble()* 101));
        }
    }
}
