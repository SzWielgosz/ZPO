package zad04;

import zad03.Pizza;

public class USB extends ProductDecorator{

    Product product;

    public USB(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + "USB, ";
    }

    @Override
    public double cost() {
        return 5 + product.cost();
    }
}
