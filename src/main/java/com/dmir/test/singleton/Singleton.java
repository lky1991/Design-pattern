package com.dmir.test.singleton;

/**
 * Created by $wally on 2016/9/17.
 */
public class Singleton {
    //外部不可见
    private static Singleton instance=new Singleton();

    //外部不能实例化
    private Singleton(){

    }
    //外部唯一接口
    public static synchronized  Singleton getInstance(){
        return instance;
    }
}
