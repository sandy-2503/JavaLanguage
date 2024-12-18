package com.sandeep.classes;

public class ExitTest {
	public static void main(String arg[]) {
		try {
			System.out.println("Before Exit");
//			System.exit(0);
			System.out.println("After Exit");
		} finally {
			//System.exit(0);
			System.out.println("Finally Exit");
		}
	}
}
