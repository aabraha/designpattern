package com.observer;

/**
 * Subject interface - defines the contract for subjects that can be observed
 * Maintains a list of observers and notifies them of changes
 */
public interface Subject {
    /**
     * Register an observer to be notified of changes
     * @param observer the observer to register
     */
    void addObserver(Observer observer);
    
    /**
     * Unregister an observer from notifications
     * @param observer the observer to unregister
     */
    void removeObserver(Observer observer);
    
    /**
     * Notify all registered observers of changes
     */
    void notifyObservers();
} 