package com.sandeep.streamex;

import java.util.ArrayList;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(15);
		marks.add(30);
		marks.add(20);
		marks.add(10);
		marks.add(50);
		marks.add(2);
		
		Integer min = marks.stream().min((o1,o2)->(o1.compareTo(o2))).get();
		System.out.println(min);
		Integer max = marks.stream().max((o1,o2)->(o1.compareTo(o2))).get();
		System.out.println(max);
		
		Integer min1 = marks.stream().min((o1,o2)->(-o1.compareTo(o2))).get();
		System.out.println(min1);
		Integer max1 = marks.stream().max((o1,o2)->(-o1.compareTo(o2))).get();
		System.out.println(max1);
		
		marks.stream().forEach(System.out::println);
	}

}
