package com.switchfully.springdi.springdi04attempt2.config;

import com.switchfully.springdi.springdi04attempt2.TaxCalculator;
import com.switchfully.springdi.springdi04attempt2.taxCalculation.AmericanTaxCalculation;
import com.switchfully.springdi.springdi04attempt2.taxCalculation.TaxCalculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

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
