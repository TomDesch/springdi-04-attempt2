package com.switchfully.springdi.springdi04attempt2;

import com.switchfully.springdi.springdi04attempt2.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Springdi04Attempt2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdi04Attempt2Application.class, args);

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TaxCalculator taxCalculator = appContext.getBean(TaxCalculator.class);

		System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(25000));
	}
}
