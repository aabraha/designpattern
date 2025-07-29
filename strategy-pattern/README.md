# Strategy Design Pattern Demo

This project demonstrates the Strategy Design Pattern as shown in the UML diagram. The pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable.

## Project Structure

- `Product.java` - Product class with productNumber, name, and price
- `SortStrategy.java` - Interface defining the sorting strategy
- `BubbleSort.java` - Concrete strategy implementing bubble sort
- `InsertionSort.java` - Concrete strategy implementing insertion sort
- `QuickSort.java` - Concrete strategy implementing quick sort
- `ProductCollection.java` - Context class that uses sorting strategies
- `Application.java` - Main class demonstrating the pattern

## Key Benefits Demonstrated

1. **Open/Closed Principle**: New sorting algorithms can be added without modifying `ProductCollection`
2. **Single Responsibility**: `ProductCollection` focuses on managing products, sorting is delegated
3. **Runtime Strategy Selection**: Different sorting strategies can be set at runtime

## How to Run

### Using Maven
```bash
mvn compile
mvn exec:java
```

### Using Java directly
```bash
javac *.java
java Application
```

## Expected Output

The program will:
1. Create a ProductCollection with sample products
2. Demonstrate sorting with Bubble Sort
3. Demonstrate sorting with Insertion Sort  
4. Demonstrate sorting with Quick Sort

Each demonstration shows the products before and after sorting, highlighting how the same `ProductCollection.sort()` method works with different strategies.

## Pattern Explanation

- **Context**: `ProductCollection` holds a reference to `SortStrategy`
- **Strategy**: `SortStrategy` interface defines the algorithm contract
- **Concrete Strategies**: `BubbleSort`, `InsertionSort`, `QuickSort` implement the interface
- **Client**: `Application` creates the context and sets the strategy

The beauty of this pattern is that `ProductCollection` doesn't need to know about specific sorting algorithms - it just delegates to whatever strategy is currently set. 