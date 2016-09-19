package com.dmir.test.iterator;

/**
 * Created by $wally on 2016/9/19.
 */
public class MyCollection implements Collection {
    private String []array={"A","B","C","D"};

    public Iterator iterator() {
        return new MyIterator(this);
    }

    public Object get(int i) {
        return array[i];
    }

    public int size() {
        return array.length;
    }

    public static void main(String[] args) {
        MyCollection myCollection=new MyCollection();
        Iterator iterator=myCollection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
