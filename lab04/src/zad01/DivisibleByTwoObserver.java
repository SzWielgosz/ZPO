package zad01;

public class DivisibleByTwoObserver implements Observer{

    private Subject inputCheckSubject;

    public DivisibleByTwoObserver(Subject inputCheckSubject) {
        this.inputCheckSubject = inputCheckSubject;
        inputCheckSubject.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number % 2 == 0) {
            System.out.println("Wykryto liczbę podzielną przez 2");
        }
    }
}
