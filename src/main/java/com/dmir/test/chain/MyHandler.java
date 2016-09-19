package com.dmir.test.chain;

/**
 * Created by $wally on 2016/9/19.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name){
        this.name=name;
    }

    public void operation() {
        System.out.println(name+"deal!!");
        if(handler!=null){
            getHandler().operation();
        }
    }

    public static void main(String[] args) {
        MyHandler myHandlerA=new MyHandler("A");
        MyHandler myHandlerB=new MyHandler("B");
        MyHandler myHandlerC=new MyHandler("C");

        myHandlerA.setHandler(myHandlerB);
        myHandlerB.setHandler(myHandlerC);

        myHandlerA.operation();

    }
}
