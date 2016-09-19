package com.dmir.test.Memento;

/**
 * Created by $wally on 2016/9/19.
 */
public class Original {
    private  String value;

    public Original(String value){
        this.value=value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Memento createMemnto(){
        return new Memento(this.value);
    }

    public void restoreMemnto(Memento memento){
        setValue(memento.getValue());
    }

    public static void main(String[] args) {
        Original original=new Original("ls");
        Memento memento=original.createMemnto();
        original.setValue("lss");
        System.out.println(original.getValue());
        original.restoreMemnto(memento);
        System.out.println(original.getValue());
    }
}
