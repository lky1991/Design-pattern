package com.dmir.test.interpreter;

/**
 * Created by $wally on 2016/9/19.
 */
public class PlusInterpreter implements  Interpreter {
    public void operation(Context context) {
        System.out.println(context.getNum1()+context.getNum2());
    }

    public static void main(String[] args) {
        Context context=new Context();
        context.setNum1(1);
        context.setNum2(2);
        new PlusInterpreter().operation(context);
    }
}
