package zad03;

class RemoveSalami extends Ingredient {
    Pizza pizza;

    public RemoveSalami(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().replace(" + salami", "");
    }

    @Override
    public double cost() {
        return pizza.cost() - 0.50;
    }
}
