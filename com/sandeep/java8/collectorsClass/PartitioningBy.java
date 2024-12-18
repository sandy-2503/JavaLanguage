package com.sandeep.java8.collectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

	public static void main(String[] args) {
		ArrayList<User> l = new ArrayList<>();
		l.add(new User("A", 40, "Computer", 2000.0, "M"));
		l.add(new User("B", 50, "Science", 3000.0, "F"));
		l.add(new User("C", 51, "Mathematics", 4000.0, "F"));
		l.add(new User("D", 42, "Science", 5000.0, "M"));
		l.add(new User("E", 44, "English", 6000.0, "F"));
		l.add(new User("E", 45, "English", 6500.0, "M"));
		l.add(new User("E", 54, "Hindi", 6000.0, "F"));
		l.add(new User("E", 51, "Hindi", 8000.0, "F"));

		// Partition the collection in two parts first is false and other is true
		Map<Boolean, List<User>> ageGreaterThen40 = l.stream().collect(Collectors.partitioningBy(a -> a.getAge() > 44));
		System.out.println(ageGreaterThen40);
	}

}
