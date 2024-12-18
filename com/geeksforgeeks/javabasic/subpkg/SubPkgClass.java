package com.geeksforgeeks.javabasic.subpkg;

import com.geeksforgeeks.javabasic.UseThisInConstructor;

public class SubPkgClass extends UseThisInConstructor {
    UseThisInConstructor obj2 = new UseThisInConstructor();
    public void anotherMethod() {
        //myMethod1(); // default Not accessible out side package
        myMethod2(); // Accessing a protected method from a subclass
        //obj2.myMethod(); // Private method not visible through object reference
    }
}
