package zad04;

class Discount extends Product {

    public double discountAmount;

    public Discount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String getDescription() {
       return "Discount";
    }

    @Override
    public double cost() {
        return -discountAmount;
    }

}