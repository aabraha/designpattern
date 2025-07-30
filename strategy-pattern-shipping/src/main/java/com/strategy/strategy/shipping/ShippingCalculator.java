package com.strategy.strategy.shipping;

import com.strategy.domain.Package;

public interface ShippingCalculator {
    double calculateShippingPrice(Package pkg);
} 