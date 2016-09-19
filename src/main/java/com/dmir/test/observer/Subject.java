package com.dmir.test.observer;

/**
 * Created by $wally on 2016/9/19.
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void delObserver(Observer observer);
    public void notifyObservers();
    public void operation();
}
