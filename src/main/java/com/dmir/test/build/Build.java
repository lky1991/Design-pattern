package com.dmir.test.build;

import com.dmir.test.factory.MailSender;
import com.dmir.test.factory.Sender;
import com.dmir.test.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by $wally on 2016/9/17.
 */
public class Build {
    private List<Sender> list=new ArrayList<Sender>();

    public void  produceSms(int n){
        for(int i=0;i<n;++i){
            list.add(new SmsSender());
        }
    }

    public  void produceMail(int n){
        for(int i=0;i<n;++i){
            list.add(new MailSender());
        }
    }

    public int getSize(){
        return list.size();
    }

    public static void main(String[] args) {
        Build build=new Build();
        build.produceMail(10);
        build.produceSms(10);
        System.out.println(build.getSize());

    }
}
