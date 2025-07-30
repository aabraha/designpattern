package com.strategy.strategy.wrapping;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("fancyWrappingCalculator")
public class FancyWrappingCalculator implements WrappingCalculator {
    @Override
    public double calculateWrappingPaperCost(Package pkg) {
        double surfaceArea = 2 * (pkg.getLength() * pkg.getWidth() + 
                                 pkg.getLength() * pkg.getHeight() + 
                                 pkg.getWidth() * pkg.getHeight());
        double baseCost = surfaceArea * 0.5;
        double premiumCost = pkg.getWeight() * 2.0; // Premium wrapping for heavy items
        return baseCost + premiumCost;
    }
} 