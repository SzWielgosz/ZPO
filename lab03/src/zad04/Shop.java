package zad04;
import java.util.ArrayList;
import java.util.List;
class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getProducts() {
        double totalPrice = 0.0;

        System.out.println("Cart Products:");
        for(Product product: products) {
            System.out.println(product.getDescription() + " " + product.cost());
            totalPrice += product.cost();
        }

        if (totalPrice < 0)
            totalPrice = 0;

        System.out.println("Total cost: " + totalPrice);
    }

}
