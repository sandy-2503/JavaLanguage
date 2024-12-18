package com.sandeep.classes;

public class D extends  ExitTest implements B,C {
    public static void main(String ar[]){
        D s = new D();
        A a = new D();
        a.show();
        B b = new D();
        b.show();
    }

    @Override
    public void show() {

    }
}
