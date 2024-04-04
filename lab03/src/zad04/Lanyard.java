package zad04;

import zad03.Pizza;

public class Lanyard extends ProductDecorator {

    Product product;

    public Lanyard(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + "Lanyard, ";
    }

    public double cost() {
        return product.cost() + 8.0;
    }
}
