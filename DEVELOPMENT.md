Implement the Strategy Design Pattern as shown in this UML diagram:

Only create the minimum set of classes and methods required to demonstrate the pattern:

Classes:
1. `ProductCollection`
   - Methods: `addProduct(Product product)`, `removeProduct(String productNumber)`, `sort()`
   - It should have a reference to a `SortStrategy`

2. `SortStrategy` (interface or abstract class)
   - Method: `sort(List<Product> products)`

3. Concrete Strategies:
   - `BubbleSort`, `InsertionSort`, `QuickSort`
   - Implement the `SortStrategy` interface with basic print/logic (real sorting not required)

4. `Product` class
   - Minimal structure: at least a `productNumber`

5. `Application` class with a `main()` method to:
   - Create a `ProductCollection`
   - Add sample `Product` items
   - Set a sorting strategy (e.g., BubbleSort)
   - Call `sort()`

Focus on showing how `ProductCollection` delegates sorting to the strategy without needing to change its code when a new algorithm is added.

Use Java and keep the code clean and minimal.
