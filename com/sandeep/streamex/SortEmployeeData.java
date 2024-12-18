package com.sandeep.streamex;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


class Employee {
	String name;
	int no;
	String dept;
	public Employee(String name, int no,String dept) {
		this.name = name;
		this.no = no;
		this.dept = dept;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}

	

	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + ", dept=" + dept + "]";
	}

}

public class SortEmployeeData {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("A", 234,"Comp"));
		l.add(new Employee("E", 236,"Comp"));
		l.add(new Employee("SS", 235,"Comp"));
		l.add(new Employee("C", 235,"Comp1"));
		l.add(new Employee("D", 237,"Comp1"));
		l.add(new Employee("B", 238,"Comp"));
		l.add(new Employee("B", 238,"Comp"));
		System.out.println(l);
		
		 Comparator<Employee> c = (o1, o2) -> o1.no < o2.no ? -1 : (o1.no > o2.no ? 1 : 0);
		 Collections.sort(l, c); 
		 System.out.println(l);
		 
		 Collections.sort(l, (o1, o2) -> o1.name.compareTo(o2.name));
		 System.out.println("Sort List :: "+l);
		 
		ArrayList<Employee> lf1 = (ArrayList<Employee>) l.stream().filter(emp->emp.name !=null).filter(emp->emp.name.equals("C")).collect(Collectors.toList());
		System.out.println(lf1);
		
		ArrayList<Employee> lf = (ArrayList<Employee>) l.stream().filter(emp->{
			if (emp == null)
            {
                return false;
            }else if ("C".equals(emp.name))
            {
                return true;
            }else {
            	return false;
            }
			}).collect(Collectors.toList());
		System.out.println(lf.toString());
		
		Map<String,Integer> map = l.stream()
				.filter(emp->emp.name !=null)
				.filter(emp->emp.name.equals("C"))
				.collect(Collectors.toMap(Employee::getName, Employee::getNo));
		System.out.println(map.toString());
		
		Map<String,Integer> groupList = l.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summingInt(Employee::getNo)));
		System.out.println(groupList);
		
		Map<String,List<Employee>>  groupByDept = l.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(groupByDept);
		
		List<Employee> modified = l.stream().collect(
				Collectors.toCollection(()->new TreeSet<>(
						Comparator.comparing(Employee::getName).
						thenComparing(Employee::getDept).
						thenComparingInt(Employee::getNo)
						))).stream().collect(Collectors.toList());

		System.out.println("Sort and Remove Duplicate : "+modified);

		ArrayList<Employee> empList = (ArrayList<Employee>) l.stream().
				filter(emp->emp.no>200).filter(emp->emp.name.equals("C")).collect(Collectors.toList());
		System.out.println("Cd department having salary greaterthen 1000"+empList);

		Map<String,Double> empList1 = empList.stream().filter(e->e.getDept().equals("Comp1"))
				.filter(e->e.no>200)
				.collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingInt(Employee::getNo)));
		System.out.println("Cd department having salary greaterthen 1000"+empList1);

		Map<Integer, Set<String>> result = l.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getNo,
								Collectors.mapping(Employee::getName, Collectors.toSet())
						)
				);
		System.out.println(" result = "+result);
	}

}
