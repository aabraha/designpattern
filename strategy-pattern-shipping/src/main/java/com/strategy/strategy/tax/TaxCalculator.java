package com.strategy.strategy.tax;

import com.strategy.domain.Package;

public interface TaxCalculator {
    double calculateTax(Package pkg);
} 