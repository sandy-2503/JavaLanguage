package com.sandeep.streamex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(15);
		marks.add(30);
		marks.add(20);
		marks.add(10);
		marks.add(50);
		marks.add(2);
		System.out.println(marks);
		// Map function
		List<Integer> updateMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("Map function "+updateMarks);

		// Count function
		long count = marks.stream().filter(i -> i < 35).count();
		System.out.println("count= "+count);
		System.out.println("============");
		// Sort function
		List<Integer> sortedMark = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Sort function "+sortedMark);
		List<Integer> sortedMark1 = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedMark1);
		List<Integer> sortedMark2 = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedMark2);
		List<Integer> sortedMark3 = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(sortedMark3);

		// Custom Sort function
		Comparator<Integer> c = (o1, o2) -> (o1 < o2 ? 1 : o1 > o2 ? -1 : 0);
		List<Integer> customSortedMark = marks.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Custtom Sort function "+customSortedMark);
		
		// Custom comparator for String object
		ArrayList<String> names = new ArrayList<>();
		names.add("A");
		names.add("AAA");
		names.add("AAAAA");
		names.add("AA");
		names.add("AAAAAA");
		Comparator<String> cc = (o1, o2) -> (o1.length() > o2.length() ? 1 : o1.length() < o2.length() ? -1 : 0);
		List<String> namesList = names.stream().sorted(cc).collect(Collectors.toList());
		System.out.println(namesList);
		
		
	}

}
