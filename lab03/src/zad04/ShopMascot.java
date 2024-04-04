package zad04;

public class ShopMascot extends ProductDecorator{

    Product product;

    public ShopMascot(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + "ShopMascot, ";
    }

    @Override
    public double cost() {
        return 0 + product.cost();
    }
}
