package com.switchfully.springdi.springdi04attempt2.config;

import com.switchfully.springdi.springdi04attempt2.TaxCalculator;
import com.switchfully.springdi.springdi04attempt2.taxCalculation.AmericanTaxCalculation;
import com.switchfully.springdi.springdi04attempt2.taxCalculation.BelgianTaxCalculation;
import com.switchfully.springdi.springdi04attempt2.taxCalculation.TaxCalculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    @Primary
    public TaxCalculation belgianTaxCalculation() {
        return new BelgianTaxCalculation();
    }

    @Bean("America")
    public TaxCalculation americanTaxCalculation() {
        return new AmericanTaxCalculation();
    }

    @Bean
    public TaxCalculator getTaxCalculator() {
        // todo fix this bcs its probably wrong
        return new TaxCalculator(new AmericanTaxCalculation());
    }
}
