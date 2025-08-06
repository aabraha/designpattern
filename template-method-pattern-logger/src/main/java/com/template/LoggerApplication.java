package com.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication implements CommandLineRunner {
    
    @Autowired
    @Qualifier("consoleLogger")
    private Logger consoleLogger;
    
    @Autowired
    @Qualifier("fileLogger")
    private Logger fileLogger;
    
    @Autowired
    @Qualifier("databaseLogger")
    private Logger databaseLogger;
    
    public static void main(String[] args) {
        SpringApplication.run(LoggerApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Template Method Pattern Logger Demo ===\n");
        
        // Create a log message
        LogMessage logMessage = new LogMessage(
            "User login successful", 
            "User ID: 12345 logged in at 10:30 AM", 
            "INFO"
        );
        
        // Demonstrate different loggers using the template method
        System.out.println("--- Console Logger ---");
        consoleLogger.log(logMessage);
        
        System.out.println("\n--- File Logger ---");
        fileLogger.log(logMessage);
        
        System.out.println("\n--- Database Logger ---");
        databaseLogger.log(logMessage);
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("Note: Each logger follows the same template method structure");
        System.out.println("but implements the specific steps differently!");
    }
} 