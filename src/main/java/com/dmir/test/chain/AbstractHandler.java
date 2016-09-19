package com.dmir.test.chain;

/**
 * Created by $wally on 2016/9/19.
 */
public abstract class AbstractHandler {
    Handler handler=null;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Handler getHandler() {
        return handler;
    }
}
