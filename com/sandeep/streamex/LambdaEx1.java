package com.sandeep.streamex;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx1 {

	public static void main(String[] args) {
		Predicate<Integer> p =i->i%2==0;
		
		System.out.println(p.test(5));
		System.out.println(p.test(8));
		
		Function<Integer,Integer> sum = (a)->(a*a);
		System.out.println(sum.apply(5));
	}

}
