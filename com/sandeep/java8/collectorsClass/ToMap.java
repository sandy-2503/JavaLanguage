package com.sandeep.java8.collectorsClass;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {

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
		
		Map<String, User> mapByName = l.stream().collect(Collectors.toMap(User::getName, Function.identity(),(a,b)->b));
		System.out.println(mapByName);
		
		//Map mapping names to a concatenated list
		Map<String, String> mapByName1 = l.stream().collect(Collectors.toMap(User::getName, User::getDept, (a,b)-> a+""+b));
		System.out.println(mapByName1);
		
		Map<String, User> conMapByName = l.stream().collect(Collectors.toConcurrentMap(User::getName, Function.identity()));
		System.out.println(conMapByName);

	}

}
