package zad04;

public class Discount extends ProductDecorator {
    private double discount = 10;

    Product product;

    public Discount(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + "discount: " + discount + " PLN";
    }

    @Override
    public double cost() {
        double totalPrice = product.cost() - discount;
        return totalPrice < 0 ? 0 : totalPrice;
    }
}