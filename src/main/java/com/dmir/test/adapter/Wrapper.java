package com.dmir.test.adapter;

/**
 * Created by $wally on 2016/9/19.
 */
public class Wrapper implements Targetable {
    private Source source=null;

    public Wrapper(Source source){
        this.source=source;
    }
    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("this is targerable method");
    }
}
