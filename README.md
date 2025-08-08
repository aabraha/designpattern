# Design Patterns Implementation

This repository contains implementations of various design patterns in Java. Each pattern is demonstrated with practical examples and clear explanations.

## 📁 Project Structure

```
designpattern/
├── factory-pattern/          # Factory Pattern implementation
├── observer-pattern-stock/   # Observer Pattern implementation
│   ├── src/main/java/com/observer/
│   │   ├── Observer.java            # Observer interface
│   │   ├── Subject.java             # Subject interface
│   │   ├── Stock.java               # Stock POJO
│   │   ├── StockService.java        # Concrete Subject implementation
│   │   ├── HistoryLogger.java       # Concrete Observer
│   │   ├── Trader.java              # Concrete Observer
│   │   ├── StockViewer.java         # Concrete Observer
│   │   ├── StockNotifier.java       # Concrete Observer
│   │   ├── StockObserverConfig.java # Spring configuration
│   │   └── StockObserverApplication.java # Spring Boot application
│   ├── pom.xml                      # Maven configuration
│   └── README.md                    # Pattern-specific documentation
├── strategy-pattern/         # Strategy Pattern implementation
│   ├── Application.java      # Main demo application
│   ├── Product.java          # Product model class
│   ├── ProductCollection.java # Context class
│   ├── SortStrategy.java     # Strategy interface
│   ├── BubbleSort.java       # Concrete strategy
│   ├── InsertionSort.java    # Concrete strategy
│   ├── QuickSort.java        # Concrete strategy
│   ├── pom.xml              # Maven configuration
│   └── README.md            # Pattern-specific documentation
├── template-method-pattern-logger/ # Template Method Pattern implementation
│   ├── src/main/java/com/template/
│   │   ├── Logger.java              # Abstract base class with template method
│   │   ├── ConsoleLogger.java       # Concrete implementation for console
│   │   ├── FileLogger.java          # Concrete implementation for file
│   │   ├── DatabaseLogger.java      # Concrete implementation for database
│   │   ├── LogMessage.java          # Data model for log messages
│   │   └── LoggerApplication.java   # Spring Boot application
│   ├── pom.xml                      # Maven configuration
│   └── README.md                    # Pattern-specific documentation
└── README.md                # This file
```

## 🎯 Implemented Patterns

### 1. Strategy Pattern
**Location**: `strategy-pattern/`

The Strategy pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

**Key Components**:
- `SortStrategy` - Strategy interface
- `BubbleSort`, `InsertionSort`, `QuickSort` - Concrete strategies
- `ProductCollection` - Context class that uses strategies
- `Product` - Model class representing products

**How to Run**:
```bash
cd strategy-pattern
java Application
```

**Demo Output**:
The application demonstrates three different sorting algorithms applied to the same product collection, showing how the Strategy pattern allows for flexible algorithm selection without modifying the core business logic.

### 2. Observer Pattern
**Location**: `observer-pattern-stock/`

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Key Components**:
- `Subject` - Interface for subjects that can be observed
- `Observer` - Interface for observers that need to be notified
- `StockService` - Concrete Subject implementation managing stock changes
- `HistoryLogger`, `Trader`, `StockViewer`, `StockNotifier` - Concrete Observer implementations
- `Stock` - Data model for stock information
- `StockObserverApplication` - Spring Boot application demonstrating the pattern

**How to Run**:
```bash
cd observer-pattern-stock
mvn spring-boot:run
```

**Demo Output**:
The application demonstrates how stock value changes automatically notify all registered observers (HistoryLogger, Trader, StockViewer, StockNotifier), showing loose coupling and easy extensibility of the Observer Pattern.

### 3. Template Method Pattern
**Location**: `template-method-pattern-logger/`

The Template Method Pattern defines the skeleton of an algorithm in a base class, letting subclasses override specific steps without changing the algorithm's structure.

**Key Components**:
- `Logger` - Abstract base class with template method
- `ConsoleLogger`, `FileLogger`, `DatabaseLogger` - Concrete implementations
- `LogMessage` - Data model for log messages
- `LoggerApplication` - Spring Boot application demonstrating the pattern

**How to Run**:
```bash
cd template-method-pattern-logger
mvn spring-boot:run
```

**Demo Output**:
The application demonstrates how different loggers (Console, File, Database) follow the same template method structure but implement specific steps differently, showing the flexibility and consistency of the Template Method pattern.

### 4. Factory Pattern
**Location**: `factory-pattern/`

*Coming soon...*

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven (optional, for some patterns)

### Running the Examples

1. **Strategy Pattern**:
   ```bash
   cd strategy-pattern
   java Application
   ```

2. **Observer Pattern**:
   ```bash
   cd observer-pattern-stock
   mvn spring-boot:run
   ```

3. **Template Method Pattern**:
   ```bash
   cd template-method-pattern-logger
   mvn spring-boot:run
   ```

4. **Factory Pattern**:
   ```bash
   cd factory-pattern
   # Instructions coming soon
   ```

## 🛠️ Development

### Adding New Patterns
1. Create a new directory for your pattern
2. Implement the pattern with clear examples
3. Add a `README.md` in the pattern directory
4. Update this main README.md
5. Include a demo application that showcases the pattern

### Code Style
- Follow Java naming conventions
- Include comprehensive comments
- Provide clear examples
- Add appropriate documentation

## 📚 Learning Resources

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns) by Gang of Four
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Java Design Patterns](https://java-design-patterns.com/)

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-pattern`)
3. Commit your changes (`git commit -m 'Add amazing pattern'`)
4. Push to the branch (`git push origin feature/amazing-pattern`)
5. Open a Pull Request

**Happy Coding! 🎉**