package zad02;

public class FirstCompany implements Observer, Display{

    public FirstCompany(String name) {
        this.name = name;
    }

    private String name;
    private double price;
    @Override
    public void update(double price) {
        this.price = price;
        display();
    }

    @Override
    public void display() {
        System.out.println(this.name + " " + this.price);
    }
}
