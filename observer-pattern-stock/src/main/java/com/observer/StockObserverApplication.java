package com.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * Main Spring Boot application that demonstrates the Observer Pattern
 * Uses CommandLineRunner to trigger stock changes and show observer notifications
 */
@SpringBootApplication
public class StockObserverApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(StockObserverApplication.class, args);
    }
    
    /**
     * CommandLineRunner to demonstrate the Observer Pattern
     */
    @Component
    public static class StockDemoRunner implements CommandLineRunner {
        
        @Autowired
        private StockService stockService;
        
        @Override
        public void run(String... args) throws Exception {
            System.out.println("\n=== Observer Pattern Stock Demo ===\n");
            
            // Demonstrate stock value changes and observer notifications
            System.out.println("1. Changing stock value for AAPL to $150.50...");
            stockService.changeStockValue("AAPL", 150.50);
            
            System.out.println("\n2. Changing stock value for GOOGL to $2750.00...");
            stockService.changeStockValue("GOOGL", 2750.00);
            
            System.out.println("\n3. Changing stock value for MSFT to $320.75...");
            stockService.changeStockValue("MSFT", 320.75);
            
            System.out.println("\n=== Demo Complete ===");
            System.out.println("Note: All observers were notified automatically without modifying the Subject!");
            System.out.println("This demonstrates loose coupling and easy extensibility of the Observer Pattern.");
        }
    }
} 