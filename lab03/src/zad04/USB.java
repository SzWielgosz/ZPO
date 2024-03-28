package zad04;

public class USB extends Product{
    @Override
    public String getDescription() {
        return "USB";
    }

    @Override
    public double cost() {
        return 5;
    }
}
