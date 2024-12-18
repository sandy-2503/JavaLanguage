package com.sandeep.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CurrentDateTIme {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getEra());
		
		System.out.println(time.getNano());
		
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:mm:ss");
		System.out.println(dt.format(dtf));
		
		LocalDateTime dtCustom = LocalDateTime.of(1982,8,28,10,10,55);
		System.out.println(dtCustom);
		
		LocalDate datePre = LocalDate.of(1984,3,25);
		LocalDate today = LocalDate.now();
		Period p = Period.between(datePre, today);
		System.out.printf("%d-%d-%d",p.getYears(),p.getMonths(),p.getDays());
		
	}

}
