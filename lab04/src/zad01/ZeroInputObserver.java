package zad01;

import java.util.Scanner;

public class ZeroInputObserver implements Observer{
    private Subject inputCheckSubject;

    public ZeroInputObserver(Subject inputCheckSubject) {
        this.inputCheckSubject = inputCheckSubject;
        inputCheckSubject.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number == 0) {
            System.out.println("Jakie wartości mają być wychwytywane przez program?");
            System.out.println("1. Liczba większa od zera");
            System.out.println("2. Liczba równa 3");
            System.out.println("3. Liczba podzielna przez 2");
            System.out.println("-1. Koniec programu");

            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new PositiveNumberObserver(inputCheckSubject);
                    break;
                case 2:
                    new NumberThreeObserver(inputCheckSubject);
                    break;
                case 3:
                    new DivisibleByTwoObserver(inputCheckSubject);
                    break;
                case -1:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Niepoprawny wybór.");
                    break;
            }
        }
    }
}
