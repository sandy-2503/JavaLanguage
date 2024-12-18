package com.sandeep.java8.collectorsClass;

public class User {
	String name;
	int age;
	String dept;
	Double salary;
	String gender;

	public User(String name, int age, String dept, Double salary, String gender) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	
	

}
