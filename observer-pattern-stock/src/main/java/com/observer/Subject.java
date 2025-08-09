package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract Subject class - provides common implementation for subjects that can be observed
 * Maintains a list of observers and notifies them of changes
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    /**
     * Register an observer to be notified of changes
     * @param observer the observer to register
     */
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }
    
    /**
     * Unregister an observer from notifications
     * @param observer the observer to unregister
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    /**
     * Notify all registered observers of changes
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
} 