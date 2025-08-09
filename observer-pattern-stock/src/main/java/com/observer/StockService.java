package com.observer;

import org.springframework.stereotype.Service;

/**
 * StockService - concrete implementation that extends Subject
 * Focuses solely on stock management responsibilities
 */
@Service
public class StockService extends Subject {
    private Stock changedStock;
    
    /**
     * Changes the stock value and notifies all observers
     * @param stockName the name of the stock
     * @param value the new value
     */
    public void changeStockValue(String stockName, double value) {
        this.changedStock = new Stock(stockName, value);
        System.out.println("Stock value changed: " + changedStock);
        notifyObservers(); // Calls the protected method from parent class
    }
    
    /**
     * Gets the stock that was most recently changed
     * @return the changed stock
     */
    public Stock getChangedStock() {
        return changedStock;
    }
} 