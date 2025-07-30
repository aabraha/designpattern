package com.strategy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.strategy.strategy.shipping.ShippingCalculator;
import com.strategy.strategy.shipping.LowCostShippingCalculator;
import com.strategy.strategy.tax.TaxCalculator;
import com.strategy.strategy.tax.LowTaxCalculator;
import com.strategy.strategy.wrapping.WrappingCalculator;
import com.strategy.strategy.wrapping.SimpleWrappingCalculator;

@Configuration
public class StrategyConfig {
    
    @Bean
    @Primary
    public ShippingCalculator shippingCalculator() {
        return new LowCostShippingCalculator();
    }
    
    @Bean
    @Primary
    public TaxCalculator taxCalculator() {
        return new LowTaxCalculator();
    }
    
    @Bean
    @Primary
    public WrappingCalculator wrappingCalculator() {
        return new SimpleWrappingCalculator();
    }
} 