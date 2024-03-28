package zad04;

public abstract class Product {
    public String description = "I don't know what product";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
