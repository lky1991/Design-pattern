package com.dmir.test.template;

/**
 * Created by $wally on 2016/9/19.
 */
public class SumCalucate extends AbstractTemplate {
    @Override
    public int cacluate(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(new SumCalucate().doit("2+3","\\+"));
    }
}
