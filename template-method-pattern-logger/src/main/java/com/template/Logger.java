package com.template;

import org.springframework.stereotype.Component;

@Component
public abstract class Logger {
    
    // Template method - defines the algorithm structure
    public final void log(LogMessage logMessage) {
        openLogRepository();
        String serializedMessage = serializeMessage(logMessage);
        writeLogMessage(serializedMessage);
        closeLogRepository();
    }
    
    // Abstract methods - must be implemented by subclasses
    protected abstract void openLogRepository();
    protected abstract void writeLogMessage(String message);
    protected abstract void closeLogRepository();
    
    // Concrete method - default implementation
    protected String serializeMessage(LogMessage message) {
        return String.format("[%s] %s - %s", 
            message.getLevel(), 
            message.getMessage(), 
            message.getDetails());
    }
} 