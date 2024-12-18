package com.test;

class Single{
    private static Single instance;
    private Single(){
        System.out.println("Single Instance");
    }

    public static Single getInstance(){
        synchronized(Single.class) {
            if (instance == null) {
                instance = new Single();
            }
        }
        return instance;
    }
}
public class SingleClass {
    public static void main(String[] args) {
        Single single = Single.getInstance();

    }
}
