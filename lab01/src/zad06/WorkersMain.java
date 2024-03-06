package zad06;

public class WorkersMain {
    public static void main(String[] args) {
        Worker mechanic = new Worker("mechanic", new CarService(), new Car(), new Gym());
        mechanic.doCommute();
        mechanic.doWork();
        mechanic.doSpendFreeTime();
    }
}
