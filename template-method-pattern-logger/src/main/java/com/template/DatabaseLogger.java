package com.template;

import org.springframework.stereotype.Component;

@Component("databaseLogger")
public class DatabaseLogger extends Logger {
    
    @Override
    protected void openLogRepository() {
        System.out.println("Opening Database Logger");
    }
    
    @Override
    protected void writeLogMessage(String message) {
        System.out.println("Writing to Database: " + message);
    }
    
    @Override
    protected void closeLogRepository() {
        System.out.println("Closing Database Logger");
    }
} 