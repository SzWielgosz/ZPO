package zad05;

public class UKTaxes implements TaxesType {
    @Override
    public double countTax(double price) {
        return price * 0.15;
    }
}
