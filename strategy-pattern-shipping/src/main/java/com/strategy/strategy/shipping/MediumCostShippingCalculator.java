package com.strategy.strategy.shipping;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("mediumCostShippingCalculator")
public class MediumCostShippingCalculator implements ShippingCalculator {
    @Override
    public double calculateShippingPrice(Package pkg) {
        double baseCost = 10.0;
        double weightCost = pkg.getWeight() * 1.0;
        double volumeCost = (pkg.getLength() * pkg.getWidth() * pkg.getHeight()) * 0.02;
        return baseCost + weightCost + volumeCost;
    }
} 