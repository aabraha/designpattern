package com.strategy.strategy.shipping;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("highCostShippingCalculator")
public class HighCostShippingCalculator implements ShippingCalculator {
    @Override
    public double calculateShippingPrice(Package pkg) {
        double baseCost = 20.0;
        double weightCost = pkg.getWeight() * 2.0;
        double volumeCost = (pkg.getLength() * pkg.getWidth() * pkg.getHeight()) * 0.05;
        return baseCost + weightCost + volumeCost;
    }
} 