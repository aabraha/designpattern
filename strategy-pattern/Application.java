public class Application {
    public static void main(String[] args) {
        System.out.println("=== Strategy Design Pattern Demo ===\n");
        
        // Create a product collection
        ProductCollection productCollection = new ProductCollection();
        
        // Add sample products
        productCollection.addProduct(new Product("P003", "Laptop", 999.99));
        productCollection.addProduct(new Product("P001", "Mouse", 29.99));
        productCollection.addProduct(new Product("P002", "Keyboard", 59.99));
        productCollection.addProduct(new Product("P005", "Monitor", 299.99));
        productCollection.addProduct(new Product("P004", "Headphones", 89.99));
        
        System.out.println("\n--- Testing Bubble Sort ---");
        productCollection.setSortStrategy(new BubbleSort());
        productCollection.sort();
        
        System.out.println("\n--- Testing Insertion Sort ---");
        productCollection.setSortStrategy(new InsertionSort());
        productCollection.sort();
        
        System.out.println("\n--- Testing Quick Sort ---");
        productCollection.setSortStrategy(new QuickSort());
        productCollection.sort();
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("Note: ProductCollection delegates sorting to different strategies");
        System.out.println("without changing its own code - demonstrating the Strategy pattern!");
    }
} 