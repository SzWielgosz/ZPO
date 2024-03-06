package zad05;

public class TaxCalculator {
    TaxesType taxesType;

    public TaxCalculator(TaxesType taxesType) {
        this.taxesType = taxesType;
    }

    void doCountTaxes(){
        this.taxesType.countTax();
    }
}
