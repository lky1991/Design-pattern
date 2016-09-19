package com.dmir.test.Memento;

/**
 * Created by $wally on 2016/9/19.
 */
public class Memento {

    private String value;

    public Memento(String value){
        this.value=value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
