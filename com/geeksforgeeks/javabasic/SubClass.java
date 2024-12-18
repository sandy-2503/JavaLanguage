package com.geeksforgeeks.javabasic;

public class SubClass extends UseThisInConstructor {
    UseThisInConstructor obj2 = new UseThisInConstructor();
    public void anotherMethod() {
        myMethod1();
        myMethod2(); // Accessing a protected method from a subclass
        //obj2.myMethod(); // Private method not visible through object reference
    }
}
