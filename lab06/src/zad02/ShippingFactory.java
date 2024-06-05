package zad02;

public class ShippingFactory {
    public static ShippingMethod getShippingMethod(ShippingType type) {
        return switch (type) {
            case STANDARD -> new StandardShipping();
            case EXPRESS -> new ExpressShipping();
            case COURIER -> new CourierShipping();
        };
    }
}
