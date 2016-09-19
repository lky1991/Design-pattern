package com.dmir.test.state;

/**
 * Created by $wally on 2016/9/19.
 */
public class State1 {

    public String value;

    public State1(){

    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void method1(){
        System.out.println("execute the first opt");
    }

    public void method2(){
        System.out.println("execute the second opt");
    }
}
