package com.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * HistoryLogger - concrete observer that logs stock changes
 */
@Component
public class HistoryLogger implements Observer {
    
    @Autowired
    private StockService stockService;
    
    @Override
    public void update() {
        Stock stock = stockService.getChangedStock();
        log(stock);
    }
    
    /**
     * Logs the stock information
     * @param stock the stock to log
     */
    public void log(Stock stock) {
        System.out.println("HistoryLogger: Logging stock change - " + stock);
    }
} 