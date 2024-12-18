package com.sandeep.java17.newfeature;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

	public static void main(String[] args) {
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
		NumberFormat fmtLong = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
		System.out.println(fmt.format(1499));
		System.out.println(fmtLong.format(1000));
		
		System.out.println(fmt.format(10000));
		System.out.println(fmtLong.format(10000));
		
		System.out.println(fmt.format(1000000));
		System.out.println(fmtLong.format(1000000));
		
		System.out.println(fmt.format(1000000000));
		System.out.println(fmtLong.format(1000000000));

	}

}
