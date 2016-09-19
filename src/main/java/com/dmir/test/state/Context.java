package com.dmir.test.state;

/**
 * Created by $wally on 2016/9/19.
 */
public class Context {
    private State1 state;



    public void setState(State1 state) {
        this.state = state;
    }

    public State1 getState() {
        return state;
    }

    public void method(){
        if(state.getValue()=="state1"){
            state.method1();
        }else{
            state.method2();
        }
    }

    public static void main(String[] args) {
        Context context=new Context();
        State1 state=new State1();
        state.setValue("dfdf");
        context.setState(state);
        context.method();

    }
}
