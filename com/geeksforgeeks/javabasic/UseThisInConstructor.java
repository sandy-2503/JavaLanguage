package com.geeksforgeeks.javabasic;

public class UseThisInConstructor {
    int x;
    public UseThisInConstructor(int x){
        this.x=x;
    }
    public  UseThisInConstructor(){
        this(0);
    }
    void myMethod1() {
        System.out.println("This is a default method.");
    }
    private void myMethod() {
        System.out.println("This is a private method.");
    }
    protected void myMethod2() {
        System.out.println("This is a protected method.");
    }
    public static void main(String[] args) {
        // Creating objects using both constructors
        UseThisInConstructor obj1 = new UseThisInConstructor(10);
        UseThisInConstructor obj2 = new UseThisInConstructor();

        System.out.println("Value of obj1.x: " + obj1.x); // Output: 10
        System.out.println("Value of obj2.x: " + obj2.x); // Output: 0

        obj1.myMethod();
    }
}
