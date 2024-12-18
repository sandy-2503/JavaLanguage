package com.sandeep.methoconstruct.reference;

interface Intref {
	public void add(int a, int b);
}

public class MethodReference2 {
	public static void sum(int x, int y) {
		System.out.println("" + (x + y));
	}
	
	public void sum1(int x, int y) {
		System.out.println("" + (x + y));
	}

	public static void main(String[] args) {
		Intref f = MethodReference2::sum;
		f.add(100, 109);
		
		MethodReference2 mf = new MethodReference2();
		Intref f1 = mf::sum1;
		f1.add(109, 105);
		
	}

}
