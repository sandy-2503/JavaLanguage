package com.sandeep.streamex;

interface I3{
	public static void m1() {
		System.out.println("Static Method");
	}
	
	default String  print() {
		System.out.println("Default");
		return "Sandeep";
	}
}
public class StaticInInterface implements I3{
	

	public static void main(String[] args) {
		I3.m1();
		StaticInInterface si = new StaticInInterface();
		si.print();
	}

}
