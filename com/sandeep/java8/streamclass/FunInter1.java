package com.sandeep.java8.streamclass;

@FunctionalInterface
interface FunInter11 {
    int operation(int a, int b);
    default void add(int a, int b){
        System.out.println(a+b);
    }
}

public class FunInter1 implements FunInter11{

    public static void main(String[] args) {
        FunInter11 add = (a,b)->a+b;
        FunInter11 sub = (a,b)->a-b;
        System.out.println(add.operation(10,10));
        System.out.println(sub.operation(10, 5));

    }

    @Override
    public void add(int a, int b){
        FunInter11.super.add(a,b);
    }
    @Override
    public int operation(int a, int b) {
        return 0;
    }
}


