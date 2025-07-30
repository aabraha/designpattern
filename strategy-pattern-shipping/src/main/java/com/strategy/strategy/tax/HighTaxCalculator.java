package com.strategy.strategy.tax;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("highTaxCalculator")
public class HighTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(Package pkg) {
        double baseTax = 5.0;
        double weightTax = pkg.getWeight() * 0.3;
        return baseTax + weightTax;
    }
} 