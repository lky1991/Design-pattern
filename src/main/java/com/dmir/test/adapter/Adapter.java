package com.dmir.test.adapter;

/**
 * Created by $wally on 2016/9/19.
 */
public class Adapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is target method");
    }

    public static void main(String[] args) {
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
