package zad05;

public class TaxCalculator {
    TaxesType taxesType;

    public TaxCalculator(TaxesType taxesType) {
        this.taxesType = taxesType;
    }

    public void setTaxesType(TaxesType taxesType) {
        this.taxesType = taxesType;
    }

    double doCountTaxes(double price){
        return this.taxesType.countTax(price);
    }
}
