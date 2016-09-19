package com.dmir.test.factory;

/**
 * Created by $wally on 2016/9/17.
 */
public class MailFactory implements Provide{
    public Sender produce() {
        return new MailSender();
    }
}
