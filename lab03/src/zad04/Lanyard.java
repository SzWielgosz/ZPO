package zad04;

import zad03.Pizza;

public class Lanyard extends Product {
    public Lanyard() {
        description = "Lanyard";
    }

    @Override
    public double cost() {
        return 1;
    }
}
