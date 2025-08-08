package com.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * StockNotifier - concrete observer that handles stock change notifications
 */
@Component
public class StockNotifier implements Observer {
    
    @Autowired
    private StockService stockService;
    
    @Override
    public void update() {
        Stock stock = stockService.getChangedStock();
        handleStockChange(stock);
    }
    
    /**
     * Handles stock change notifications
     * @param stock the stock that changed
     */
    public void handleStockChange(Stock stock) {
        System.out.println("StockNotifier: Handling stock change notification - " + stock);
    }
} 