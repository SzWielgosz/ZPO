package zad05;

public class MainShopApp {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(new GermanyTaxes());
        System.out.println(taxCalculator.doCountTaxes(1000));
        taxCalculator.setTaxesType(new PolandTaxes());
        System.out.println(taxCalculator.doCountTaxes(1000));
        taxCalculator.setTaxesType(new UKTaxes());
        System.out.println(taxCalculator.doCountTaxes(1000));
    }
}
