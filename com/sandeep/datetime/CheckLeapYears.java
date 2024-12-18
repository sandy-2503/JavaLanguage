package com.sandeep.datetime;

import java.time.Year;
import java.util.Scanner;

public class CheckLeapYears {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		Year y = Year.of(n);
		if (y.isLeap()) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}

}
