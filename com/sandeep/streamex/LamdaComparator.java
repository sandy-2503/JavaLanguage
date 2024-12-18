package com.sandeep.streamex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LamdaComparator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(40);

		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? -1 : ((o1 > o2) ? 1 : 0);
		Collections.sort(al, c);
		
		System.out.println(al);

	}

}
