package com.sandeep.streamex;

interface I1 {
	default void m1() {
		System.out.println("Default 1");
	}
	public static void m2() {
		System.out.println("Static method");
	}
}

interface I2 {
	default void m1() {
		System.out.println("Default 2");
	}
	
}

public class DefaultMethod implements I1,I2{

	public void m1() {
		System.out.println("Default 3");
		I1.super.m1();
		I2.super.m1();
		I1.m2();
	}

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.m1();
	}

}
