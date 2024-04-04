package zad03;

public class RemoveJalapeno extends Ingredient{
    Pizza pizza;

    public RemoveJalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().replace(" + jalapeno", "");
    }

    @Override
    public double cost() {
        return pizza.cost() - 0.30;
    }
}
