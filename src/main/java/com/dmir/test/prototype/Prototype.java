package com.dmir.test.prototype;

import java.io.*;
import java.util.Objects;

/**
 * Created by $wally on 2016/9/19.
 */
public class Prototype implements Cloneable,Serializable{
    private String string;

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone()throws CloneNotSupportedException{
        Prototype prototype=(Prototype)super.clone();
        return prototype;
    }

    /**
     * 深复制
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone()throws IOException,ClassNotFoundException{
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        ObjectOutputStream objectOutput=new ObjectOutputStream(baos);
        objectOutput.writeObject(this);

        ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(bais);
        Object object=objectInputStream.readObject();

        return object;
    }
}
