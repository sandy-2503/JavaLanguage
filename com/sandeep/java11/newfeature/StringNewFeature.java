package com.sandeep.java11.newfeature;

import java.util.List;


public class StringNewFeature {

	public static void main(String[] args) {
		String str = "bMy name is Sandeep Kumar ";
		
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(5));
		System.out.println(str.codePointCount(6, 10));
		
		int l =  str.codePoints().sum();
		System.out.println(" Letter ASCCI value SUM = "+l);
		
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		
		List<String> lineCount = multilineString.lines().filter(e->!e.isBlank()).toList();
		lineCount.forEach(System.out::println);
		
		System.out.println(str.trim());
		System.out.println(str.strip());

	}

}
