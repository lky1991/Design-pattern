package com.dmir.test.iterator;

/**
 * Created by $wally on 2016/9/19.
 */
public class MyIterator implements Iterator {
    private MyCollection myCollection=null;
    private int pos=-1;

    public MyIterator(MyCollection myCollection){
        this.myCollection=myCollection;
    }

    public Object previous() {

        if(pos>0){
            --pos;

        }
        return myCollection.get(pos);
    }

    public Object next() {
        if(pos<(myCollection.size()-1)){
           pos++;
        }
        return myCollection.get(pos);
    }

    public boolean hasNext() {
        if(pos<(myCollection.size()-1)){
            return true;
        }
        return false;
    }

    public Object frist() {
        return myCollection.get(0);
    }
}
