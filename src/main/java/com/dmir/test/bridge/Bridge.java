package com.dmir.test.bridge;

/**
 * Created by $wally on 2016/9/19.
 */
public class Bridge {
    private Source source=null;

    public void method(){
        source.method();
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Source getSource() {
        return source;
    }

    public static void main(String[] args) {
        Sub1 sub1=new Sub1();
        Bridge bridge=new Bridge();
        bridge.setSource(sub1);
        bridge.method();
    }
}
