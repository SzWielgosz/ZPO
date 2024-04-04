package zad04;

public class ShopMain {
    public static void main(String[] args) {
        Product shoppingCart = new ShoppingCart();
        shoppingCart = new USB(shoppingCart);
        System.out.printf("%s cost: %.2f\n", shoppingCart.getDescription(), shoppingCart.cost());
        shoppingCart = new Lanyard(shoppingCart);
        System.out.printf("%s cost: %.2f\n", shoppingCart.getDescription(), shoppingCart.cost());
        shoppingCart = new ShopMascot(shoppingCart);
        System.out.printf("%s cost: %.2f\n", shoppingCart.getDescription(), shoppingCart.cost());
        shoppingCart = new Discount(shoppingCart);
        System.out.printf("%s cost: %.2f\n", shoppingCart.getDescription(), shoppingCart.cost());
    }
}


