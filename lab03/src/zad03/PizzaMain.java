package zad03;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new ClassicPizza();
        System.out.println("Description: " + pizza.getDescription() + ", cost: " + pizza.cost());
        pizza = new Salami(pizza);
        System.out.println("Description: " + pizza.getDescription() + ", cost: " + pizza.cost());
        pizza = new Jalapeno(pizza);
        System.out.println("Description: " + pizza.getDescription() + ", cost: " + pizza.cost());
        pizza = new RemoveSalami(pizza);
        System.out.println("Description: " + pizza.getDescription() + ", cost: " + pizza.cost());
    }
}
