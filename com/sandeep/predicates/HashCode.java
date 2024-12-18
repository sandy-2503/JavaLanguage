package com.sandeep.predicates;

public class HashCode {

	public static void main(String[] args) {
		int n = 16;
		int code = -764911444 & (n - 1);
		System.out.println(-764911444%16);
		System.out.println(code);
		String key = "Sandeep";
		System.out.println(key.hashCode());
		key = "Lovely";
		System.out.println(key.hashCode());
	}

}
