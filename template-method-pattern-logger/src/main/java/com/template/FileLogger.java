package com.template;

import org.springframework.stereotype.Component;

@Component("fileLogger")
public class FileLogger extends Logger {
    
    @Override
    protected void openLogRepository() {
        System.out.println("Opening File Logger");
    }
    
    @Override
    protected void writeLogMessage(String message) {
        System.out.println("Writing to File: " + message);
    }
    
    @Override
    protected void closeLogRepository() {
        System.out.println("Closing File Logger");
    }
} 