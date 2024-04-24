package zad01;

public class PositiveNumberObserver implements Observer{

    private Subject inputCheckSubject;
    public PositiveNumberObserver(Subject inputCheckSubject) {
        this.inputCheckSubject = inputCheckSubject;
        inputCheckSubject.registerObserver(this);
    }
    @Override
    public void update(int number) {
        if (number > 0) {
            System.out.println("Wykryto liczbę większą od zera: " + number);
        }
    }
}
