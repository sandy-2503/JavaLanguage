package com.sandeep.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone.getId());
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
	}

}
