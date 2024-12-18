package com.sandeep.java8.collectorsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ToCollectionExample {

	public static void main(String[] args) {
		ArrayList<User> l = new ArrayList<>();
		l.add(new User("A", 40, "Comp", 2000.0, "M"));
		l.add(new User("B", 50, "Comp1", 3000.0, "F"));
		l.add(new User("C", 51, "Comp2", 4000.0, "F"));
		l.add(new User("D", 42, "Comp2", 5000.0, "M"));
		l.add(new User("E", 44, "Comp1", 6000.0, "F"));
		l.add(new User("E", 54, "Comp1", 6000.0, "F"));

		// toCollection
		System.out.println("===========toCollection===========");
		Set<String> people = l.stream().map(User::getName).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(people);

		// toList
		System.out.println("===========toList===========");
		List<String> nameList = l.stream().map(User::getName).collect(Collectors.toList());
		nameList.forEach(System.out::println);
		nameList.forEach(s -> System.out.print(s + ","));

		// toSet
		System.out.println("===========toSet===========");
		Set<String> toSet = l.stream().map(User::getName).collect(Collectors.toSet());
		toSet.forEach(System.out::print);

		System.out.println("===========joining===========");
		String join = l.stream().map(User::getName).collect(Collectors.joining("#"));
		System.out.println(join);
		String join1 = l.stream().map(User::getName).collect(Collectors.joining("#", "sandeep", "tomar"));
		System.out.println(join1);

		System.out.println("===========mapping===========");
		Map<String, Set<String>> lastNamesByCity = l.stream()
				.collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getDept, Collectors.toSet())));
		System.out.println(lastNamesByCity);

		System.out.println("===========collectingAndThen===========");
		List<User> collectingAndThen = l.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		collectingAndThen.forEach(s -> System.out.println(s.getName()));

		System.out.println("===========counting===========");
		Map<String, Map<String, Long>> countMaleFemaleOfEachDept = l.stream().collect(
				Collectors.groupingBy(User::getDept, Collectors.groupingBy(User::getGender, Collectors.counting())));
		System.out.println(countMaleFemaleOfEachDept);

		System.out.println("===========minBy===========");
		Comparator<User> comp = (a, b) -> a.getAge() > b.getAge() ? 1 : a.getAge() < b.getAge() ? 0 : -1;
		Optional<User> minUser = l.stream().collect(Collectors.minBy(comp));
		minUser.stream().forEach((a -> System.out.println(a.getName() + " " + a.getAge())));
		if (minUser.isPresent()) {
			System.out.println(minUser.get().getAge());

		} else {
			System.out.println("No user");
		}

		System.out.println("===========reducing===========");
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		Comparator<String> comp1 = (w1, w2) -> w1.length() > w2.length() ? 1 :w1.length() > w2.length() ?0:-1 ;
		Optional<String> longestString = words.stream().reduce(BinaryOperator.maxBy(comp1));
		if(longestString.isPresent()) {
			System.out.println(longestString.get());
		}
		Optional<String> longestString1 = words.stream().reduce((s1,s2)->s1+"-"+s2);
		if(longestString.isPresent()) {	
			System.out.println(longestString1);
		}
		
		Map<String, Optional<User>> getDeptwiseMaxSalary = l.stream().collect(
				Collectors.groupingBy(User::getDept,
						Collectors.reducing(BinaryOperator.
								maxBy(Comparator.comparing(User::getSalary))))); 
		for (String name : getDeptwiseMaxSalary.keySet()) {
			Optional<User> user = getDeptwiseMaxSalary.get(name);
			if(user.isPresent()) {
				User u = user.get();
				System.out.println(u.toString());
			}
		}
		System.out.println(getDeptwiseMaxSalary);
	}

}
