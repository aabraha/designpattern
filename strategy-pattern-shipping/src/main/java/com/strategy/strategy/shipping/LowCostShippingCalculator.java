package com.strategy.strategy.shipping;

import org.springframework.stereotype.Component;
import com.strategy.domain.Package;

@Component("lowCostShippingCalculator")
public class LowCostShippingCalculator implements ShippingCalculator {
    @Override
    public double calculateShippingPrice(Package pkg) {
        double baseCost = 5.0;
        double weightCost = pkg.getWeight() * 0.5;
        double volumeCost = (pkg.getLength() * pkg.getWidth() * pkg.getHeight()) * 0.01;
        return baseCost + weightCost + volumeCost;
    }
} 