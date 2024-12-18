package com.sandeep.java8.collectorsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java8GroupByExamles {

	public static void main(String[] args) {
		ArrayList<User> l = new ArrayList<>();
		l.add(new User("A", 40, "Comp", 2000.0, "M"));
		l.add(new User("B", 50, "Comp1", 3000.0, "F"));
		l.add(new User("C", 51, "Comp2", 4000.0, "F"));
		l.add(new User("D", 42, "Comp2", 5000.0, "M"));
		l.add(new User("E", 44, "Comp1", 6000.0, "F"));
		
		Map<String, Long> groupByResult1 = l.stream().collect(Collectors.groupingBy(User::getDept,Collectors.counting()));
		Comparator<User> salaryComparator = (w1, w2) -> w1.getSalary() > w2.getSalary() ? 1 :w1.getSalary() > w2.getSalary() ?0:-1 ;
		Map<String, Optional<User>> groupByResult = l.stream().
				collect(Collectors.groupingBy(User::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(User::getSalary)))));
		System.out.println(groupByResult);
		
		Double groupBySalary = l.stream().collect(Collectors.averagingDouble(User::getSalary));
		System.out.println(groupBySalary);
		
		// Average salary of each department
		Map<String, Double> avgOfEachDept = l.stream().collect(Collectors.groupingBy(User::getDept,Collectors.averagingDouble(User::getSalary)));
		System.out.println(avgOfEachDept);
		
		// Count male and female in each department
		Map<String, Map<String, Long>> countMaleFemaleOfEachDept = l.stream()
				.collect(Collectors.groupingBy(User::getDept,Collectors.groupingBy(User::getGender,Collectors.counting())));
		System.out.println(countMaleFemaleOfEachDept);
		
		Double totalSalary = l.stream().collect(Collectors.summingDouble(User::getSalary));
		System.out.println(totalSalary);
		
		Double averageSalary = l.stream().collect(Collectors.averagingDouble(User::getSalary));
		System.out.println(averageSalary);
		
		System.out.println("===========groupingByConcurrent===========");
		Map<Integer, List<User>> userMap = l.stream().collect(Collectors.groupingByConcurrent((a)->a.getDept().length()));
		System.out.println(userMap);
		Map<Integer, Long> userCount = l.stream().collect(Collectors.groupingByConcurrent((a)->a.getDept().length(),Collectors.counting()));
		System.out.println(userCount);
		
	}

}
