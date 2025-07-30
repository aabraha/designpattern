package com.strategy.domain;

import com.strategy.strategy.shipping.ShippingCalculator;
import com.strategy.strategy.tax.TaxCalculator;
import com.strategy.strategy.wrapping.WrappingCalculator;

public class Package {
    private double length;
    private double width;
    private double height;
    private double weight;
    private Address fromAddress;
    private Address toAddress;

    private ShippingCalculator shippingCalculator;
    private TaxCalculator taxCalculator;
    private WrappingCalculator wrappingCalculator;

    public Package(double length, double width, double height, double weight, 
                   Address fromAddress, Address toAddress) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public void setShippingCalculator(ShippingCalculator shippingCalculator) {
        this.shippingCalculator = shippingCalculator;
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void setWrappingCalculator(WrappingCalculator wrappingCalculator) {
        this.wrappingCalculator = wrappingCalculator;
    }

    public double calculateShippingPrice() {
        if (shippingCalculator == null || taxCalculator == null || wrappingCalculator == null) {
            throw new IllegalStateException("All calculators must be set before calculating shipping price");
        }
        
        double shippingCost = shippingCalculator.calculateShippingPrice(this);
        double taxCost = taxCalculator.calculateTax(this);
        double wrappingCost = wrappingCalculator.calculateWrappingPaperCost(this);
        
        double totalCost = shippingCost + taxCost + wrappingCost;
        
        System.out.println("=== Package Shipping Calculation ===");
        System.out.println("Package dimensions: " + length + "x" + width + "x" + height + " cm, Weight: " + weight + " kg");
        System.out.println("From: " + fromAddress);
        System.out.println("To: " + toAddress);
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Tax cost: $" + taxCost);
        System.out.println("Wrapping cost: $" + wrappingCost);
        System.out.println("Total cost: $" + totalCost);
        System.out.println("=====================================");
        
        return totalCost;
    }

    // Getters
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public Address getFromAddress() { return fromAddress; }
    public Address getToAddress() { return toAddress; }
} 