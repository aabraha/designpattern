import java.util.List;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(List<Product> products) {
        System.out.println("Sorting using Bubble Sort algorithm");
        
        int n = products.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products.get(j).getProductNumber().compareTo(products.get(j + 1).getProductNumber()) > 0) {
                    // Swap products
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("Bubble Sort completed!");
    }
} 