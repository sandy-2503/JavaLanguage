package com.sandeep.java8.streamclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sandeep.java8.collectorsClass.User;

public class StreamMethods {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1);

		ArrayList<User> l = new ArrayList<>();
		l.add(new User("A", 40, "Computer", 2000.0, "M"));
		l.add(new User("B", 50, "Science", 3000.0, "F"));
		l.add(new User("C", 51, "Mathematics", 4000.0, "F"));
		l.add(new User("D", 42, "Science", 5000.0, "M"));
		l.add(new User("E", 44, "English", 6000.0, "F"));
		l.add(new User("E", 45, "English", 6500.0, "M"));
		l.add(new User("E", 54, "Hindi", 6000.0, "F"));
		l.add(new User("E", 51, "Hindi", 8000.0, "F"));

		//Returns whether any elements of this stream match the provided predicate.
		System.out.println(l.stream().anyMatch(a -> a.getAge() > 30));
		
		//Returns whether all elements of this stream match the provided predicate.
		System.out.println(l.stream().allMatch(a -> a.getAge() == 51));
		
		System.out.println(l.stream().count());
		
		Stream<Integer> dis = s.distinct();
		dis.forEach(System.out::print);
		
		System.out.println("========");
		// Sum of salary
		Double sumOfSalary = l.stream().collect(Collectors.summingDouble(a->a.getSalary()));
		System.out.println(sumOfSalary);
		System.out.println("========");
		Stream<Integer> s1 = Stream.of(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
		Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1);
		Stream<Integer> concatss1 = Stream.concat(s1, s2);
		concatss1.forEach(System.out::println);
		System.out.println("========");
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1);
		s.map(n->n*4).forEach(System.out::println);
		
		List<String> list = Arrays.asList("5.6", "7.4", "4", 
                "1", "2.3");
		System.out.println("========");
		list.stream().flatMap(num-> Stream.of(num)).forEach(System.out::println);
		
		System.out.println(1<<30);
		System.out.println(2<<2);
		
		Map<Integer, String> m = new HashMap<>();
		List<String> ll = new ArrayList<>();
		
		System.out.println("====Sum====");
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1);
		int sum = s.filter(n->n%2 == 0).collect(Collectors.summingInt(n->n));
		
		System.out.println(sum);
		//s.map(n->n+n).forEach(System.out::println);
 	}

}
