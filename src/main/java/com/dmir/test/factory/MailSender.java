package com.dmir.test.factory;

/**
 * Created by $wally on 2016/9/17.
 */
public class MailSender implements Sender{
    public void sendMessage() {
        System.out.println("this is mail sender");
    }
}
