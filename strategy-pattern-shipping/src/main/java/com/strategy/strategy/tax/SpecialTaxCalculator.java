package com.strategy.strategy.tax;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("specialTaxCalculator")
public class SpecialTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(Package pkg) {
        double baseTax = 3.5;
        double weightTax = pkg.getWeight() * 0.2;
        double volumeTax = (pkg.getLength() * pkg.getWidth() * pkg.getHeight()) * 0.005;
        return baseTax + weightTax + volumeTax;
    }
} 