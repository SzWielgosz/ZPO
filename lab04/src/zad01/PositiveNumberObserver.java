package zad01;

public class PositiveNumberObserver implements Observer{
    @Override
    public void update(int number) {
        if (number > 0) {
            System.out.println("Wykryto liczbę większą od zera: " + number);
        }
    }
}
