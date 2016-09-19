package com.dmir.test.adapter;

/**
 * Created by $wally on 2016/9/19.
 */
public class Wrapper1 extends AbtractTarget {
    @Override
    public void method1() {
        System.out.println("this is source method");
    }

    public static void main(String[] args) {
        new Wrapper1().method1();
        new Wrapper1().method2();
    }
}
