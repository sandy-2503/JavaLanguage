package com.sandeep.streamex;

public interface Intef1 {
	private void display() {
		System.out.println("private method");
	}
	
		default void display1() {
			System.out.println("default method");
		}
		
		static void display2() {
			System.out.println("default method");
		}
}
