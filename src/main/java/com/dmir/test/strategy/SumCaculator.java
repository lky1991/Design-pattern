package com.dmir.test.strategy;

/**
 * Created by $wally on 2016/9/19.
 */
public class SumCaculator extends AbstractCaculator implements ICalculator {
    public int calculator(String exp,String op) {
        return this.split(exp,op)[0]-this.split(exp,op)[1];
    }

    public static void main(String[] args) {
       System.out.println(new SumCaculator().calculator("3-2","-"));
    }
}
