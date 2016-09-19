package com.dmir.test.strategy;


/**
 * Created by $wally on 2016/9/19.
 */
public class AbstractCaculator{
    public int[] split(String exp,String op){
        String array[]=exp.split(op);

        int []ans=new int[array.length];
        for(int i=0;i<array.length;++i){
            ans[i]=Integer.valueOf(array[i]);
        }
        return ans;
    }
}
