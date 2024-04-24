package zad01;

public class CheckNumberMain {
    public static void main(String[] args) {
        InputCheckSubject inputCheckSubject = new InputCheckSubject();
        ZeroInputObserver zeroInputObserver = new ZeroInputObserver(inputCheckSubject);
        inputCheckSubject.getNumbers();
    }
}
