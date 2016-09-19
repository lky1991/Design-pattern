package com.dmir.test.factory;

/**
 * Created by $wally on 2016/9/17.
 */
public class SimpleFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        Sender sender=SimpleFactory.produceSms();
        sender.sendMessage();
        sender=SimpleFactory.produceMail();
        sender.sendMessage();
    }
}
