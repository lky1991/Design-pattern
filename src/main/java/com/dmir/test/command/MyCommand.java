package com.dmir.test.command;

import com.dmir.test.chain.MyHandler;

/**
 * Created by $wally on 2016/9/19.
 */
public class MyCommand implements Command {
    private Receiver receiver=null;

    public MyCommand(Receiver receiver){
        this.receiver=receiver;
    }

    public void exec() {
        receiver.action();
    }
}
