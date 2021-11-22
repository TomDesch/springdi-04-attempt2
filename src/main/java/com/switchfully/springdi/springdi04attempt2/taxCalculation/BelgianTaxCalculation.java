package com.switchfully.springdi.springdi04attempt2.taxCalculation;

public class BelgianTaxCalculation implements TaxCalculation {
    private static final double BELGIAN_TAX_RATE = 0.45;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * BELGIAN_TAX_RATE;
    }
}
