package zad01;

public class NumberThreeObserver implements Observer{
    @Override
    public void update(int number) {
        if (number == 3) {
            System.out.println("Wykryto liczbę równą 3");
        }
    }
}
