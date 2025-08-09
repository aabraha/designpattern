# Observer Pattern - Stock Monitoring System

This project demonstrates the Observer Pattern implementation for a stock monitoring system using Spring Boot, following the Single Responsibility Principle.

## Overview

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Class Structure

Based on the UML diagram, the implementation includes:

### Core Classes
- **Subject (Abstract Class)**: Provides common observer management functionality
  - `addObserver(Observer observer)`: Register an observer
  - `removeObserver(Observer observer)`: Unregister an observer  
  - `notifyObservers()`: Notify all registered observers (protected method)

- **Observer (Interface)**: Defines the contract for observers
  - `update()`: Method called when subject changes

### Data Model
- **Stock**: POJO with `stockName` and `value` attributes

### Concrete Implementation
- **StockService**: Extends Subject class and focuses on stock management
  - `changeStockValue(String stockName, double value)`: Changes stock value and notifies observers
  - `getChangedStock()`: Returns the most recently changed stock

### Concrete Observers
- **HistoryLogger**: Logs stock changes
- **Trader**: Handles trading based on stock changes
- **StockViewer**: Displays stock information
- **StockNotifier**: Handles stock change notifications

## Key Benefits Demonstrated

1. **Single Responsibility Principle**: StockService focuses only on stock management, while Subject handles observer management
2. **Loose Coupling**: Subject depends only on Observer interface, not concrete implementations
3. **Easy Extensibility**: New observers can be added without modifying the Subject
4. **Code Reuse**: Common observer management logic is in the abstract Subject class
5. **Automatic Notification**: All observers are notified automatically when stock values change

## Design Improvements

### Inheritance Structure
- **Subject** is now an abstract class providing common observer management
- **StockService** extends Subject and focuses solely on stock operations
- **Separation of Concerns**: Observer management vs. Stock management

### Single Responsibility Principle
- **Subject**: Responsible for observer registration and notification
- **StockService**: Responsible for stock value changes and data management
- **Observers**: Each responsible for their specific notification handling

## Running the Application

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Build and Run
```bash
mvn clean compile
mvn spring-boot:run
```

### Expected Output
```
=== Observer Pattern Stock Demo ===

Registering observers with StockService...
All observers registered successfully!

1. Changing stock value for AAPL to $150.50...
Stock value changed: Stock{stockName='AAPL', value=150.5}
HistoryLogger: Logging stock change - Stock{stockName='AAPL', value=150.5}
Trader: Trading based on stock change - Stock{stockName='AAPL', value=150.5}
StockViewer: Displaying stock value - Stock{stockName='AAPL', value=150.5}
StockNotifier: Handling stock change notification - Stock{stockName='AAPL', value=150.5}

2. Changing stock value for GOOGL to $2750.00...
Stock value changed: Stock{stockName='GOOGL', value=2750.0}
HistoryLogger: Logging stock change - Stock{stockName='GOOGL', value=2750.0}
Trader: Trading based on stock change - Stock{stockName='GOOGL', value=2750.0}
StockViewer: Displaying stock value - Stock{stockName='GOOGL', value=2750.0}
StockNotifier: Handling stock change notification - Stock{stockName='GOOGL', value=2750.0}

3. Changing stock value for MSFT to $320.75...
Stock value changed: Stock{stockName='MSFT', value=320.75}
HistoryLogger: Logging stock change - Stock{stockName='MSFT', value=320.75}
Trader: Trading based on stock change - Stock{stockName='MSFT', value=320.75}
StockViewer: Displaying stock value - Stock{stockName='MSFT', value=320.75}
StockNotifier: Handling stock change notification - Stock{stockName='MSFT', value=320.75}

=== Demo Complete ===
Note: All observers were notified automatically without modifying the Subject!
This demonstrates loose coupling and easy extensibility of the Observer Pattern.
```

## Adding a New Observer

To demonstrate easy extensibility, you can add a new observer by:

1. Creating a new class that implements `Observer`
2. Adding the `@Component` annotation
3. The observer will be automatically registered via `StockObserverConfig`

Example:
```java
@Component
public class NewObserver implements Observer {
    @Autowired
    private StockService stockService;
    
    @Override
    public void update() {
        Stock stock = stockService.getChangedStock();
        // Handle the update
    }
}
```

## Design Pattern Benefits

- **Single Responsibility**: Each class has one clear responsibility
- **Loose Coupling**: Subject and observers are loosely coupled
- **Extensibility**: Easy to add new observers without changing existing code
- **Reusability**: Common observer logic is reusable in other contexts
- **Maintainability**: Changes to observers don't affect the subject