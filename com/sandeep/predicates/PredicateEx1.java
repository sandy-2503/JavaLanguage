package com.sandeep.predicates;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateEx1 {

	public static void main(String[] args) {
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(10));
		
		//Predicate Joining and, or, negate
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>20;
		Predicate<Integer> p3 = i->(i/5)==0;
		
		System.out.println(p1.and(p2).and(p3).test(50));
		System.out.println(p1.or(p2).or(p3).test(50));
		System.out.println(p1.negate().test(30));
		
		int []a = {0,5,10,20,30,40,50,21};
		Predicate<Integer> c1 = i->i%2==0;
		Predicate<Integer> c2 = i->i>10;
		// Even numbers
		System.out.println("Evem number ");
		for (int j : a) {
			if(c1.and(c2).test(j)) {
				System.out.println(""+j);
			}
		}
		System.out.println("Odd numbers");
		for (int j : a) {
			if(c1.negate().test(j)) {
				System.out.println(""+j);
			}
		}
		
		IntPredicate ip = i->i%2==0;
	}

}
