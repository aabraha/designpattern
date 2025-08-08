package com.observer;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * StockService - concrete implementation of Subject
 * Manages stock changes and notifies all registered observers
 */
@Service
public class StockService implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Stock changedStock;
    
    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
    /**
     * Changes the stock value and notifies all observers
     * @param stockName the name of the stock
     * @param value the new value
     */
    public void changeStockValue(String stockName, double value) {
        this.changedStock = new Stock(stockName, value);
        System.out.println("Stock value changed: " + changedStock);
        notifyObservers();
    }
    
    /**
     * Gets the stock that was most recently changed
     * @return the changed stock
     */
    public Stock getChangedStock() {
        return changedStock;
    }
} 