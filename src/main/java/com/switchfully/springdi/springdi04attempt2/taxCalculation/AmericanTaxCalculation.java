package com.switchfully.springdi.springdi04attempt2.taxCalculation;

public class AmericanTaxCalculation implements TaxCalculation {
    private static final double US_TAX_RATE = 0.18;
    private static final double US_LUMP_SUM = 950;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * US_TAX_RATE + US_LUMP_SUM;
    }
}
