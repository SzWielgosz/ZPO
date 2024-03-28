package zad04;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product1 = new USB();
        shop.addProduct(product1);

        Product product2 = new USB();
        shop.addProduct(product2);

        Product product3 = new Lanyard();
        shop.addProduct(product3);

        Product product4 = new Discount(10);
        shop.addProduct(product4);

        System.out.println("Bought products:");
        shop.getProducts();

    }
}
