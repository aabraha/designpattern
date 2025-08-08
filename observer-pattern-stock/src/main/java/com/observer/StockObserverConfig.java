package com.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

/**
 * Configuration class to wire up all observers to the StockService
 * Demonstrates loose coupling - observers are automatically registered
 */
@Configuration
public class StockObserverConfig {
    
    @Autowired
    private StockService stockService;
    
    @Autowired
    private HistoryLogger historyLogger;
    
    @Autowired
    private Trader trader;
    
    @Autowired
    private StockViewer stockViewer;
    
    @Autowired
    private StockNotifier stockNotifier;
    
    /**
     * Register all observers with the StockService after Spring context is ready
     */
    @PostConstruct
    public void registerObservers() {
        System.out.println("Registering observers with StockService...");
        stockService.addObserver(historyLogger);
        stockService.addObserver(trader);
        stockService.addObserver(stockViewer);
        stockService.addObserver(stockNotifier);
        System.out.println("All observers registered successfully!");
    }
} 