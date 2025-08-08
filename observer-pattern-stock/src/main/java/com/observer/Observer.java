package com.observer;

/**
 * Observer interface - defines the contract for all observers
 * that need to be notified when the subject changes
 */
public interface Observer {
    /**
     * Method called by the subject to notify this observer of changes
     */
    void update();
} 