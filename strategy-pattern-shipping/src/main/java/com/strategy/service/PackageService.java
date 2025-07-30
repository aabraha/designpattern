package com.strategy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.strategy.domain.Package;
import com.strategy.strategy.shipping.ShippingCalculator;
import com.strategy.strategy.shipping.HighCostShippingCalculator;
import com.strategy.strategy.tax.TaxCalculator;
import com.strategy.strategy.tax.HighTaxCalculator;
import com.strategy.strategy.wrapping.WrappingCalculator;
import com.strategy.strategy.wrapping.ExpensiveWrappingCalculator;

@Service
public class PackageService {
    
    @Autowired
    @Qualifier("lowCostShippingCalculator")
    private ShippingCalculator shippingCalculator;
    
    @Autowired
    @Qualifier("lowTaxCalculator")
    private TaxCalculator taxCalculator;
    
    @Autowired
    @Qualifier("simpleWrappingCalculator")
    private WrappingCalculator wrappingCalculator;
    
    public double calculateTotalCost(Package pkg) {
        double shippingCost = shippingCalculator.calculateShippingPrice(pkg);
        double taxCost = taxCalculator.calculateTax(pkg);
        double wrappingCost = wrappingCalculator.calculateWrappingPaperCost(pkg);
        
        return shippingCost + taxCost + wrappingCost;
    }
    
    // Method to demonstrate switching strategies
    public void demonstrateStrategySwitching(Package pkg) {
        System.out.println("\n=== Strategy Pattern Demonstration ===");
        System.out.println("Original calculation:");
        double originalCost = calculateTotalCost(pkg);
        
        // Switch to high-cost strategies
        System.out.println("\nSwitching to high-cost strategies:");
        shippingCalculator = new HighCostShippingCalculator();
        taxCalculator = new HighTaxCalculator();
        wrappingCalculator = new ExpensiveWrappingCalculator();
        
        double highCost = calculateTotalCost(pkg);
        
        System.out.println("\nCost comparison:");
        System.out.println("Original cost: $" + originalCost);
        System.out.println("High-cost strategies: $" + highCost);
        System.out.println("Difference: $" + (highCost - originalCost));
        System.out.println("=====================================");
    }
} 