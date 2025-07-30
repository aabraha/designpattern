package com.strategy.strategy.tax;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("lowTaxCalculator")
public class LowTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(Package pkg) {
        double baseTax = 2.0;
        double weightTax = pkg.getWeight() * 0.1;
        return baseTax + weightTax;
    }
} 