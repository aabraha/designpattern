package com.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Trader - concrete observer that handles trading based on stock changes
 */
@Component
public class Trader implements Observer {
    
    @Autowired
    private StockService stockService;
    
    @Override
    public void update() {
        Stock stock = stockService.getChangedStock();
        trade(stock);
    }
    
    /**
     * Performs trading based on stock information
     * @param stock the stock to trade
     */
    public void trade(Stock stock) {
        System.out.println("Trader: Trading based on stock change - " + stock);
    }
} 