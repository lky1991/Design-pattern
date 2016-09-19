package com.dmir.test.proxy;

/**
 * Created by $wally on 2016/9/19.
 */
public class Proxy implements Base{
    private Source source;
    public Proxy(Source source){
        super();
        this.source=source;
    }
    public void method() {
        System.out.println("before proxy");
        source.method();
        System.out.println("after proxy");
    }
}
