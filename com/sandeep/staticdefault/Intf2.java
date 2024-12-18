package com.sandeep.staticdefault;

public interface Intf2 {
	
	static void s1() {
		System.out.println("Static s1 f2");
	}
	
	default void d1() {
		System.out.println("Dedault d1 f2");
	}
	
	default void d2() {
		System.out.println("Dedault d2 f2");
	}
}
