package com.dmir.test.decorator;

import com.dmir.test.decorator.Source;

/**
 * Created by $wally on 2016/9/19.
 */
public class Decorator implements Sourceable {
    private Source source=null;
    public Decorator(Source source){
        this.source=source;
    }
    public void method() {
        System.out.println("before decorator ");
        source.method();
        System.out.println("after decortor");
    }

    public static void main(String[] args) {
        Source source=new Source();
        Sourceable sourceable=new Decorator(source);
        sourceable.method();
    }
}
