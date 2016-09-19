package com.dmir.test.observer;

import java.util.Vector;

/**
 * Created by $wally on 2016/9/19.
 */
public class MySubject implements Subject {
    private Vector<Observer> vector=new Vector<Observer>();

    public void addObserver(Observer observer) {
        vector.add(observer);
    }

    public void delObserver(Observer observer) {
        vector.remove(observer);
    }

    public void notifyObservers() {
        for(int i=0;i<vector.size();++i){
            vector.get(i).update();
        }
    }

    public void operation() {
        System.out.println("update myself");
        notifyObservers();
    }

    public static void main(String[] args) {
        MySubject mySubject=new MySubject();
        mySubject.addObserver(new Observer1());
        mySubject.addObserver(new Observer2());

        mySubject.operation();
    }
}
