package zad04;
class ShoppingCart extends Product{

    public String getDescription() {
        return "Shopping cart: ";
    }
    @Override
    public double cost() {
        return 0;
    }
}
