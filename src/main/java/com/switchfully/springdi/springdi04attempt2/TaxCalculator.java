package com.switchfully.springdi.springdi04attempt2;

import com.switchfully.springdi.springdi04attempt2.taxCalculation.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculator {
    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(@Qualifier("America") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesBasedOnYearlyIncome(double yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}
