package zad02;

public class Main {
    public static void main(String[] args) {
        ShippingMethod shippingMethod = ShippingFactory.getShippingMethod(ShippingType.EXPRESS);
        shippingMethod.ship();
    }
}