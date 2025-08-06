package com.template;

import org.springframework.stereotype.Component;

@Component("consoleLogger")
public class ConsoleLogger extends Logger {
    
    @Override
    protected void openLogRepository() {
        System.out.println("Opening Console Logger");
    }
    
    @Override
    protected void writeLogMessage(String message) {
        System.out.println("Writing to Console: " + message);
    }
    
    @Override
    protected void closeLogRepository() {
        System.out.println("Closing Console Logger");
    }
} 