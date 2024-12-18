package com.sandeep.streamex;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(15);
		marks.add(30);
		marks.add(20);
		marks.add(10);
		marks.add(50);
		marks.add(2);
		System.out.println(marks);
		ArrayList<Integer> marksf = (ArrayList<Integer>) marks.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(marksf.toString());
	}

}
