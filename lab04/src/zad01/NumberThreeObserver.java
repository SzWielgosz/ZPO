package zad01;

public class NumberThreeObserver implements Observer{

    private Subject inputCheckSubject;
    public NumberThreeObserver(Subject inputCheckSubject) {
        this.inputCheckSubject = inputCheckSubject;
        inputCheckSubject.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number == 3) {
            System.out.println("Wykryto liczbę równą 3");
        }
    }
}
