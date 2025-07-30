# Strategy Pattern - Package Shipping Calculator

A Spring Boot application demonstrating the Strategy Design Pattern applied to package shipping calculations with multiple calculation strategies.

## Overview

This application demonstrates how the Strategy Pattern can be used with Spring Boot's dependency injection to manage different calculation strategies for shipping, tax, and wrapping costs.

## Architecture

### Domain Classes
- **`Address`** - Contains street, city, zip, and country information
- **`Package`** - Contains dimensions (length, width, height, weight) and references to calculation strategies

### Strategy Interfaces
- **`ShippingCalculator`** - Interface for shipping cost calculations
- **`TaxCalculator`** - Interface for tax calculations  
- **`WrappingCalculator`** - Interface for wrapping paper cost calculations

### Strategy Implementations

#### Shipping Calculators
- **`LowCostShippingCalculator`** - Basic shipping with low rates
- **`MediumCostShippingCalculator`** - Medium-tier shipping rates
- **`HighCostShippingCalculator`** - Premium shipping with high rates

#### Tax Calculators
- **`LowTaxCalculator`** - Low tax rates
- **`HighTaxCalculator`** - High tax rates
- **`SpecialTaxCalculator`** - Special tax calculation including volume

#### Wrapping Calculators
- **`SimpleWrappingCalculator`** - Basic wrapping paper cost
- **`ExpensiveWrappingCalculator`** - Premium wrapping paper
- **`FancyWrappingCalculator`** - Luxury wrapping with premium features

## Key Features

1. **Spring Dependency Injection** - Uses `@Autowired` and `@Qualifier` for strategy injection
2. **Strategy Pattern** - Decouples calculation logic from the Package class
3. **Runtime Strategy Switching** - Demonstrates how strategies can be changed at runtime
4. **Multiple Strategy Combinations** - Shows different combinations of strategies

## How to Run

```bash
# Navigate to the project directory
cd strategy-pattern-shipping

# Run with Maven
mvn spring-boot:run

# Or compile and run
mvn clean compile
mvn exec:java -Dexec.mainClass="Application"
```

## Example Output

```
=== Spring Boot Strategy Pattern Demo ===
Package Shipping Calculator with Strategy Pattern
===============================================

1. Basic calculation with injected strategies:
=== Package Shipping Calculation ===
Package dimensions: 20.0x15.0x10.0 cm, Weight: 5.0 kg
From: 123 Main St, New York, 10001, USA
To: 456 Oak Ave, Los Angeles, 90210, USA
Shipping cost: $12.5
Tax cost: $2.5
Wrapping cost: $85.0
Total cost: $100.0
=====================================
Total cost calculated: $100.0

2. Strategy switching demonstration:
=== Strategy Pattern Demonstration ===
Original calculation:
...
```

## Benefits

1. **Decoupling** - Package class is not tied to specific calculation implementations
2. **Extensibility** - New calculation strategies can be added without modifying existing code
3. **Testability** - Each strategy can be tested independently
4. **Flexibility** - Strategies can be swapped at runtime
5. **Spring Integration** - Leverages Spring's DI container for strategy management

## Strategy Pattern Elements

- **Context**: `Package` class holds references to strategy interfaces
- **Strategy Interfaces**: `ShippingCalculator`, `TaxCalculator`, `WrappingCalculator`
- **Concrete Strategies**: Various implementations of each calculator interface
- **Dependency Injection**: Spring manages strategy selection and injection 