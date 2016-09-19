package com.dmir.test.template;

/**
 * Created by $wally on 2016/9/19.
 */
public abstract class AbstractTemplate {

    public  final int doit(String exp,String op){
        int []a=split(exp,op);
        return cacluate(a[0],a[1]);
    }

    public abstract int cacluate(int a,int b);

    public int[] split(String exp,String op){
        String array[]=exp.split(op);

        int []ans=new int[array.length];
        for(int i=0;i<array.length;++i){
            ans[i]=Integer.valueOf(array[i]);
        }
        return ans;
    }
}
