package com.geeksforgeeks.javabasic;

class School{
    private String name;
    private  String location;

    School(String name, String location){
        this.name = name;
        this.location = location;
    }
}

class Student{
    private String name;
    private School school;
    public Student(String name, School school){
        this.name = name;
        this.school = school;
    }
}
public class AggregationEx1 {
    public static void main(String[] args) {

    }
}
