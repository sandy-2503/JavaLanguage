package com.sandeep.streamex;

import java.util.Date;

public class Movie {
	String name;
	Date startTime;
	Date endTime;
	
	
	public Movie() {
		super();
	}
	public Movie(String name, Date startTime, Date endTime) {
		super();
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
}
