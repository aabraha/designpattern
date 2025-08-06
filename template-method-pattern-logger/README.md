# Template Method Pattern - Logger Implementation

This project demonstrates the **Template Method Design Pattern** using a logging system implemented with Spring Boot.

## 🎯 Pattern Overview

The Template Method Pattern defines the skeleton of an algorithm in a base class, letting subclasses override specific steps without changing the algorithm's structure.

## 📁 Project Structure

```
template-method-pattern-logger/
├── src/main/java/com/template/
│   ├── Logger.java              # Abstract base class with template method
│   ├── ConsoleLogger.java       # Concrete implementation for console
│   ├── FileLogger.java          # Concrete implementation for file
│   ├── DatabaseLogger.java      # Concrete implementation for database
│   ├── LogMessage.java          # Data model for log messages
│   └── LoggerApplication.java   # Spring Boot application
├── pom.xml                      # Maven configuration
└── README.md                    # This file
```

## 🏗️ Architecture

### Abstract Class: `Logger`
- **Template Method**: `log(LogMessage message)` - defines the algorithm structure
- **Abstract Methods**: 
  - `openLogRepository()`
  - `writeLogMessage(String message)`
  - `closeLogRepository()`
- **Concrete Method**: `serializeMessage(LogMessage message)` - default implementation

### Concrete Implementations
- **`ConsoleLogger`**: Logs to console output
- **`FileLogger`**: Simulates file logging
- **`DatabaseLogger`**: Simulates database logging

### Data Model
- **`LogMessage`**: Contains message, details, and level fields

## 🚀 How to Run

### Prerequisites
- Java 17 or higher
- Maven

### Running the Application
```bash
cd template-method-pattern-logger
mvn spring-boot:run
```

### Expected Output
```
=== Template Method Pattern Logger Demo ===

--- Console Logger ---
Opening Console Logger
Writing to Console: [INFO] User login successful - User ID: 12345 logged in at 10:30 AM
Closing Console Logger

--- File Logger ---
Opening File Logger
Writing to File: [INFO] User login successful - User ID: 12345 logged in at 10:30 AM
Closing File Logger

--- Database Logger ---
Opening Database Logger
Writing to Database: [INFO] User login successful - User ID: 12345 logged in at 10:30 AM
Closing Database Logger

=== Demo Complete ===
Note: Each logger follows the same template method structure
but implements the specific steps differently!
```

## 🎯 Key Benefits

1. **Code Reuse**: Common logging algorithm is defined once in the base class
2. **Flexibility**: Subclasses can customize specific steps without changing the overall structure
3. **Consistency**: All loggers follow the same sequence of operations
4. **Extensibility**: Easy to add new logger types by extending the base class

## 🔧 Spring Boot Integration

- Uses `@Component` annotations for dependency injection
- Uses `@Qualifier` to distinguish between different logger implementations
- Implements `CommandLineRunner` for automatic execution on startup

## 📚 Learning Points

- **Template Method**: The `log()` method defines the algorithm structure
- **Hook Methods**: Abstract methods that subclasses must implement
- **Default Implementation**: `serializeMessage()` provides a common implementation
- **Spring Integration**: Demonstrates how design patterns work with Spring Boot

---

**Happy Learning! 🎉** 