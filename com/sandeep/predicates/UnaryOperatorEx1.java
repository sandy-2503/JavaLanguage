package com.sandeep.predicates;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> f = i -> i * i;
		System.out.println(f.apply(6));

		IntUnaryOperator iu = i -> i * i;
		System.out.println(iu.applyAsInt(6));

		DoubleUnaryOperator du = i -> i * i;
		System.out.println(du.applyAsDouble(99));

		BiFunction<String, String, String> bf = (i, j) -> (i + j);
		System.out.println(bf.apply("Hello ", "Java"));

		BinaryOperator<Integer> bo = (i, j) -> i * j;
		System.out.println(bo.apply(10, 17));

		IntBinaryOperator ibo = (i, j) -> i * j;
		System.out.println(ibo.applyAsInt(10, 17));
	}

}
