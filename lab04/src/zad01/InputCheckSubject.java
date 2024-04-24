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
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update(number);
        }
    }

    public void getNumbers(){
        int number;
        while(true){
            System.out.printf("Podaj liczbe:");
            number = scanner.nextInt();
            notifyObservers(number);
        }
    }

}
