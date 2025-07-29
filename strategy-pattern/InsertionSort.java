import java.util.List;

public class InsertionSort implements SortStrategy {
    @Override
    public void sort(List<Product> products) {
        System.out.println("Sorting using Insertion Sort algorithm");
        
        int n = products.size();
        for (int i = 1; i < n; i++) {
            Product key = products.get(i);
            int j = i - 1;
            
            while (j >= 0 && products.get(j).getProductNumber().compareTo(key.getProductNumber()) > 0) {
                products.set(j + 1, products.get(j));
                j = j - 1;
            }
            products.set(j + 1, key);
        }
        
        System.out.println("Insertion Sort completed!");
    }
} 