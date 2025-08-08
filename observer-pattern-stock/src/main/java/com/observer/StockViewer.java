package com.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * StockViewer - concrete observer that displays stock information
 */
@Component
public class StockViewer implements Observer {
    
    @Autowired
    private StockService stockService;
    
    @Override
    public void update() {
        Stock stock = stockService.getChangedStock();
        showStockValue(stock);
    }
    
    /**
     * Displays the stock value
     * @param stock the stock to display
     */
    public void showStockValue(Stock stock) {
        System.out.println("StockViewer: Displaying stock value - " + stock);
    }
} 