package com.strategy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.strategy.domain.Address;
import com.strategy.domain.Package;
import com.strategy.service.PackageService;
import com.strategy.strategy.shipping.LowCostShippingCalculator;
import com.strategy.strategy.shipping.HighCostShippingCalculator;
import com.strategy.strategy.shipping.ShippingCalculator;
import com.strategy.strategy.tax.LowTaxCalculator;
import com.strategy.strategy.tax.HighTaxCalculator;
import com.strategy.strategy.tax.SpecialTaxCalculator;
import com.strategy.strategy.tax.TaxCalculator;
import com.strategy.strategy.wrapping.SimpleWrappingCalculator;
import com.strategy.strategy.wrapping.ExpensiveWrappingCalculator;
import com.strategy.strategy.wrapping.FancyWrappingCalculator;
import com.strategy.strategy.wrapping.WrappingCalculator;

@SpringBootApplication
public class Application implements CommandLineRunner {
    
    @Autowired
    private PackageService packageService;
    
    @Autowired
    private LowCostShippingCalculator lowCostShippingCalculator;
    
    @Autowired
    private LowTaxCalculator lowTaxCalculator;
    
    @Autowired
    private SimpleWrappingCalculator simpleWrappingCalculator;
    
    @Autowired
    private HighCostShippingCalculator highCostShippingCalculator;
    
    @Autowired
    private HighTaxCalculator highTaxCalculator;
    
    @Autowired
    private ExpensiveWrappingCalculator expensiveWrappingCalculator;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Spring Boot Strategy Pattern Demo ===");
        System.out.println("Package Shipping Calculator with Strategy Pattern");
        System.out.println("===============================================");
        
        // Create dummy addresses
        Address fromAddress = new Address("123 Main St", "New York", "10001", "USA");
        Address toAddress = new Address("456 Oak Ave", "Los Angeles", "90210", "USA");
        
        // Create dummy package
        Package pkg = new Package(20.0, 15.0, 10.0, 5.0, fromAddress, toAddress);
        
        // Set strategies using Spring-managed beans
        pkg.setShippingCalculator(lowCostShippingCalculator);
        pkg.setTaxCalculator(lowTaxCalculator);
        pkg.setWrappingCalculator(simpleWrappingCalculator);
        
        // Demonstrate the strategy pattern
        System.out.println("\n1. Basic calculation with injected strategies:");
        double totalCost = pkg.calculateShippingPrice();
        System.out.println("Total cost calculated: $" + totalCost);
        
        // Demonstrate strategy switching
        System.out.println("\n2. Strategy switching demonstration:");
        demonstrateStrategySwitching(pkg);
        
        // Demonstrate different strategy combinations
        System.out.println("\n3. Different strategy combinations:");
        demonstrateDifferentStrategies(pkg);
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("The Strategy Pattern allows us to:");
        System.out.println("- Inject different calculation strategies");
        System.out.println("- Switch strategies at runtime");
        System.out.println("- Combine different strategies");
        System.out.println("- Keep the Package class decoupled from specific implementations");
    }
    
    private void demonstrateStrategySwitching(Package pkg) {
        System.out.println("\n=== Strategy Pattern Demonstration ===");
        System.out.println("Original calculation:");
        double originalCost = pkg.calculateShippingPrice();
        
        // Switch to high-cost strategies
        System.out.println("\nSwitching to high-cost strategies:");
        pkg.setShippingCalculator(highCostShippingCalculator);
        pkg.setTaxCalculator(highTaxCalculator);
        pkg.setWrappingCalculator(expensiveWrappingCalculator);
        
        double highCost = pkg.calculateShippingPrice();
        
        System.out.println("\nCost comparison:");
        System.out.println("Original cost: $" + originalCost);
        System.out.println("High-cost strategies: $" + highCost);
        System.out.println("Difference: $" + (highCost - originalCost));
        System.out.println("=====================================");
    }
    
    private void demonstrateDifferentStrategies(Package pkg) {
        System.out.println("\n--- Low Cost + Special Tax + Fancy Wrapping ---");
        // This would normally be done through configuration or factory
        // For demo purposes, we'll create new instances
        ShippingCalculator lowShipping = new LowCostShippingCalculator();
        TaxCalculator specialTax = new SpecialTaxCalculator();
        WrappingCalculator fancyWrapping = new FancyWrappingCalculator();
        
        double shippingCost = lowShipping.calculateShippingPrice(pkg);
        double taxCost = specialTax.calculateTax(pkg);
        double wrappingCost = fancyWrapping.calculateWrappingPaperCost(pkg);
        
        System.out.println("Shipping (Low Cost): $" + shippingCost);
        System.out.println("Tax (Special): $" + taxCost);
        System.out.println("Wrapping (Fancy): $" + wrappingCost);
        System.out.println("Total: $" + (shippingCost + taxCost + wrappingCost));
    }
} 