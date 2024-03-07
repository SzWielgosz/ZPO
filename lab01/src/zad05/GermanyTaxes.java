package zad05;

public class GermanyTaxes implements TaxesType {
    @Override
    public double countTax(double price) {
        return price * 0.19;
    }
}
