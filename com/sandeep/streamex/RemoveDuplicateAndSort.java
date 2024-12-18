package com.sandeep.streamex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class RemoveDuplicateAndSort {

	public static void main(String[] args) {
		ArrayList<Movie> l = new ArrayList<>();
//		l.add(new Movie("A", new Date(),));
//		l.add(new Movie("E", 236,"Comp"));
//		l.add(new Movie("SS", 235,"Comp"));
//		l.add(new Movie("C", 235,"Comp1"));
//		l.add(new Movie("D", 237,"Comp1"));
//		l.add(new Movie("B", 238,"Comp"));
//		l.add(new Movie("B", 238,"Comp"));
		String dateInString1 = "2011-12-03T10:15:30";
		String dateInString2 = "2011-12-03T10:16:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

		LocalDateTime date1 = LocalDateTime.parse(dateInString1, formatter);
		LocalDateTime date2 = LocalDateTime.parse(dateInString2, formatter);
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date1.until(date2, ChronoUnit.SECONDS));


	}

}
