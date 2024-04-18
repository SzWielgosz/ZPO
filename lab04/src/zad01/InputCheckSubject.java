package zad01;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCheckSubject implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int number) {
        for(Observer observer: observers){
            observer.update(number);
        }
    }

    public int getNumber(){
        System.out.println("Podaj liczbe:");
        return scanner.nextInt();
    }
}
