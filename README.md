# Design Patterns Implementation

This repository contains implementations of various design patterns in Java. Each pattern is demonstrated with practical examples and clear explanations.

## 📁 Project Structure

```
designpattern/
├── factory-pattern/          # Factory Pattern implementation
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

### 2. Factory Pattern
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

2. **Factory Pattern**:
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

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Gang of Four for the original design patterns
- The Java community for continuous improvements
- All contributors to this repository

---

**Happy Coding! 🎉**