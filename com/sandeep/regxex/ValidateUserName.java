package com.sandeep.regxex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {

	public static void main(String[] args) {
		// greater then 12 digit
		// One special character
		// Digit, numbers
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("MxxY");
		System.out.println("Input String matches regex - "+matcher.matches());
		// bad regular expression
		//pattern = Pattern.compile("*xx*");
		Pattern pattern1 = Pattern.compile(".xx.");
		if(Pattern.matches("(\\w\\d)\\1", "a2a2")){
			System.out.println("Condition true");
		}
	}

}
