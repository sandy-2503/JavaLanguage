package com.geeksforgeeks.javabasic;

public class UsingThis {
    int a;
    int b;
    {
        this.a = 55;
        this.b = 99;
    }
    UsingThis(){
        this.a =10;
        this.b=20;
        System.out.println("Default");
    }

    UsingThis(String name){
        System.out.println("Parameterised Constructor"+name);
    }
    UsingThis get(){
        return this;
    }
    public static void main(String[] args) {
        UsingThis ut = new UsingThis();
        UsingThis utGet = ut.get();
        System.out.println(utGet.a);

        UsingThis utParameter = new UsingThis("Sandeep");
        UsingThis utGetParameter = utParameter.get();
        System.out.println(utGetParameter.a);
    }
}
