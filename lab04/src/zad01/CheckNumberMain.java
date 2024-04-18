package zad01;

public class CheckNumberMain {
    public static void main(String[] args) {
        InputCheckSubject inputCheckSubject = new InputCheckSubject();

        int number;
        boolean start = true;

        while (start) {
            number = inputCheckSubject.getNumber();
            if (number == 0) {
                System.out.println("Jakie wartości mają być wychwytywane przez program?");
                System.out.println("1. Liczba większa od zera");
                System.out.println("2. Liczba równa 3");
                System.out.println("3. Liczba podzielna przez 2");
                System.out.println("-1. Koniec programu");

                int choice = inputCheckSubject.getNumber();

                switch (choice) {
                    case 1:
                        inputCheckSubject.registerObserver(new PositiveNumberObserver());
                        break;
                    case 2:
                        inputCheckSubject.registerObserver(new NumberThreeObserver());
                        break;
                    case 3:
                        inputCheckSubject.registerObserver(new DivisibleByTwoObserver());
                        break;
                    case -1:
                        start = false;
                        break;

                    default:
                        System.out.println("Niepoprawny wybór.");
                        break;
                }
            } else {
                inputCheckSubject.notifyObservers(number);
            }
        }
    }
}
