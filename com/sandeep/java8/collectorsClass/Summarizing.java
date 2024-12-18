package com.sandeep.java8.collectorsClass;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizing {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		IntSummaryStatistics result = s.collect(Collectors.summarizingInt(a->a));
		System.out.println("=========1======");
		System.out.println(result.getSum());
		System.out.println("=========2======");
		System.out.println(result);
		
		ArrayList<User> l = new ArrayList<>();
		l.add(new User("A", 40, "Computer", 2000.0, "M"));
		l.add(new User("B", 50, "Science", 3000.0, "F"));
		l.add(new User("C", 51, "Mathematics", 4000.0, "F"));
		l.add(new User("D", 42, "Science", 5000.0, "M"));
		l.add(new User("E", 44, "English", 6000.0, "F"));
		l.add(new User("E", 45, "English", 6500.0, "M"));
		l.add(new User("E", 54, "Hindi", 6000.0, "F"));
		l.add(new User("E", 51, "Hindi", 8000.0, "F"));
		
		IntSummaryStatistics resultUser = l.stream().collect(Collectors.summarizingInt(User::getAge));
		System.out.println("=========3======");
		System.out.println(resultUser);
		System.out.println("=========4======");
		System.out.println(l.stream().anyMatch(a->a.getAge()>30));

	}

}
