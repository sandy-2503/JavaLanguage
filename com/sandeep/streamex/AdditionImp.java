package com.sandeep.streamex;

@FunctionalInterface
interface addition {
	public abstract int add(int a, int b);
}

public class AdditionImp {

	public static void main(String arg[]) {
		int a = 10, b = 20;
		addition add = (x, y) -> (a + b);
		System.out.print(add.add(a, b));
	}
}
