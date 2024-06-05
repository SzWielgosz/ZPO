package zad02;

public class ExpressShipping implements ShippingMethod {
    @Override
    public void ship() {
        System.out.println("Shipping with express delivery service.");
    }
}
