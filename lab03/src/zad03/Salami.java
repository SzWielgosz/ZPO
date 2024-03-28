package zad03;

public class Salami extends Ingredient{
    Pizza pizza;

    public Salami(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + salami";
    }

    @Override
    public double cost() {
        return 0.50 + pizza.cost();
    }
}
