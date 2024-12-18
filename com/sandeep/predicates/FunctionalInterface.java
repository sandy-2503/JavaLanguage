package com.sandeep.predicates;

import java.util.function.Function;

public class FunctionalInterface {
	public static void main(String a[]) {
		Function<Integer,Integer> f = i->i*i;
		
		System.out.println(f.apply(5));
		
		// Function join
		Function<Integer,Integer> f1 = i->i*i;
		Function<Integer,Integer> f2 = i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}
}
