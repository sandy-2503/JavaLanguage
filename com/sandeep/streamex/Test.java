package com.sandeep.streamex;

interface Intrf{
	public void add(int a,int b);
}
public class Test {

	public static void main(String[] args) {
		Intrf i = (a,b)->System.out.println(a+b);
		i.add(10, 40);
	}

}
