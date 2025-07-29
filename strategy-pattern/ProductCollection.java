import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products;
    private SortStrategy sortStrategy;

    public ProductCollection() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product: " + product);
    }

    public void removeProduct(String productNumber) {
        products.removeIf(product -> product.getProductNumber().equals(productNumber));
        System.out.println("Removed product with number: " + productNumber);
    }

    public void sort() {
        if (sortStrategy == null) {
            System.out.println("No sorting strategy set!");
            return;
        }
        
        System.out.println("Before sorting:");
        displayProducts();
        
        sortStrategy.sort(products);
        
        System.out.println("After sorting:");
        displayProducts();
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
        System.out.println("Sorting strategy set to: " + sortStrategy.getClass().getSimpleName());
    }

    private void displayProducts() {
        for (Product product : products) {
            System.out.println("  " + product);
        }
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
} 