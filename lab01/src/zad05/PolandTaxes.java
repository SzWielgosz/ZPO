package zad05;

public class PolandTaxes implements TaxesType {
    @Override
    public double countTax(double price) {
        return price * 0.23;
    }
}
