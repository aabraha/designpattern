package com.observer;

/**
 * Stock POJO - represents a stock with name and value
 */
public class Stock {
    private String stockName;
    private double value;
    
    public Stock() {}
    
    public Stock(String stockName, double value) {
        this.stockName = stockName;
        this.value = value;
    }
    
    public String getStockName() {
        return stockName;
    }
    
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    
    public double getValue() {
        return value;
    }
    
    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", value=" + value +
                '}';
    }
} 