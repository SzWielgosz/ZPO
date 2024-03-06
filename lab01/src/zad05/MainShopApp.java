package zad05;

public class MainShopApp {
    public static void main(String[] args) {
        GermanyTaxes germanyTaxes = new GermanyTaxes();
        UKTaxes ukTaxes = new UKTaxes();
        PolandTaxes polandTaxes = new PolandTaxes();

        TaxCalculator taxCalculator = new TaxCalculator(polandTaxes);
        taxCalculator.doCountTaxes();
    }
}
