package com.template;

import lombok.Data;

@Data
public class LogMessage {
    private String message;
    private String details;
    private String level;
    
    public LogMessage(String message, String details, String level) {
        this.message = message;
        this.details = details;
        this.level = level;
    }
} 