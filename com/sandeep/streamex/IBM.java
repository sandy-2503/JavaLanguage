package com.sandeep.streamex;

import java.util.*;
import java.util.stream.Collectors;

public class IBM {

	public static void main(String[] args) {
		Employee e = new Employee("Saneeep", 5,"qwewe");
		System.out.println(e);
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("A", 234,"Comp"));
		l.add(new Employee("E", 236,"Comp"));
		l.add(new Employee("SS", 235,"Comp"));
		l.add(new Employee("C", 235,"Comp1"));
		l.add(new Employee("D", 237,"Comp1"));
		l.add(new Employee("B", 238,"Comp"));
		System.out.println(l);

		ArrayList<Employee> lf1 = (ArrayList<Employee>) l.stream().filter(emp -> emp.name != null)
				.filter(emp -> emp.name.equals("C")).collect(Collectors.toList());
		System.out.println(lf1);

		ArrayList<Employee> lf = (ArrayList<Employee>) l.stream().filter(emp -> {
			if (emp == null) {
				return false;
			} else if ("C".equals(emp.name)) {
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());
		System.out.println(lf.toString());

		Map<String, Integer> map = l.stream().filter(emp -> emp.name != null).filter(emp -> emp.name.equals("C"))
				.collect(Collectors.toMap(Employee::getName, Employee::getNo));
		System.out.println("Map values"+map.toString());

		// Handle duplicate key
		Map<String, Integer> map1 = l.stream().collect(Collectors.toMap(Employee::getDept, Employee::getNo, (e1,e2)->e1));
		System.out.println("List to map"+map1.toString());

		//Preserve Order of Elements when converting a List to Map
		Map<String, Integer> map2 = l.stream().collect(Collectors.toMap(Employee::getDept, Employee::getNo, (e1,e2)->e1, LinkedHashMap::new));
		System.out.println("List to map"+map2.toString());

		List<Integer> number = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			number.add(i);
		}

		for (Integer i : number) {
			System.out.print(i+"=");
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("sandeepakshay");
			} else if (i % 3 == 0) {
				System.out.println("sandeep");
			} else if (i % 5 == 0) {
				System.out.println("Akshay");
			} else {
				System.out.println(i);
			}
		}
		// Group by Dept 
		Map<String, Long> groupBy = l.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		System.out.println(groupBy);
	}

}
