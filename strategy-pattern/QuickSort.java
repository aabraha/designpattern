import java.util.List;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(List<Product> products) {
        System.out.println("Sorting using Quick Sort algorithm");
        
        if (products.size() <= 1) {
            return;
        }
        
        quickSort(products, 0, products.size() - 1);
        
        System.out.println("Quick Sort completed!");
    }
    
    private void quickSort(List<Product> products, int low, int high) {
        if (low < high) {
            int pi = partition(products, low, high);
            quickSort(products, low, pi - 1);
            quickSort(products, pi + 1, high);
        }
    }
    
    private int partition(List<Product> products, int low, int high) {
        Product pivot = products.get(high);
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (products.get(j).getProductNumber().compareTo(pivot.getProductNumber()) <= 0) {
                i++;
                Product temp = products.get(i);
                products.set(i, products.get(j));
                products.set(j, temp);
            }
        }
        
        Product temp = products.get(i + 1);
        products.set(i + 1, products.get(high));
        products.set(high, temp);
        
        return i + 1;
    }
} 