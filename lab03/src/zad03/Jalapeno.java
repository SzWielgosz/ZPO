package zad03;

public class Jalapeno extends Ingredient{
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + jalapeno";
    }

    @Override
    public double cost() {
        return 0.30 + pizza.cost();
    }
}
