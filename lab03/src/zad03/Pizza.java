package zad03;

public abstract class Pizza {
    public String description = "I don't know what pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
