package com.sandeep.methoconstruct.reference;

public class MethodReference {
	public int m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Chield Thread-1");
		}
		return 1;
	}

	public static void main(String[] args) {
		MethodReference mf = new MethodReference();
		Runnable r = mf::m1;

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread-1");
		}
	}

}
