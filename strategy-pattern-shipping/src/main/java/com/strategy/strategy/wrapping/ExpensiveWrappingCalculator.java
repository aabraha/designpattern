package com.strategy.strategy.wrapping;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("expensiveWrappingCalculator")
public class ExpensiveWrappingCalculator implements WrappingCalculator {
    @Override
    public double calculateWrappingPaperCost(Package pkg) {
        double surfaceArea = 2 * (pkg.getLength() * pkg.getWidth() + 
                                 pkg.getLength() * pkg.getHeight() + 
                                 pkg.getWidth() * pkg.getHeight());
        return surfaceArea * 0.3;
    }
} 