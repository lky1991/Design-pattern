package com.dmir.test.command;

/**
 * Created by $wally on 2016/9/19.
 */
public class Invoker {
    Command command=null;

    public Invoker(Command command){
        this.command=command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 下达命令
     */
    public  void action(){
        command.exec();
    }

    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command=new MyCommand(receiver);

        new Invoker(command).action();
    }
}
