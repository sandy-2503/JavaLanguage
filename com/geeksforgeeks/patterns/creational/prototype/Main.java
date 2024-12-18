package com.geeksforgeeks.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp = new Employee();
        emp.setName("Sandeep");
        emp.setDept("Computer");
        emp.setAge(40);
        emp.setSalary(300000);

        employeeList.add(emp);

        PrototypeEmployee prototypeEmployee = new PrototypeEmployee(employeeList);

        try {
            PrototypeEmployee empsNew = (PrototypeEmployee) prototypeEmployee.clone();
            PrototypeEmployee empsNew1 = (PrototypeEmployee) prototypeEmployee.clone();

            List<Employee> list = empsNew.getEmpList();
            Employee emp1 = new Employee();
            emp1.setName("Sandeep1");
            emp1.setDept("Computer1");
            emp1.setAge(41);
            emp1.setSalary(300001);
            list.add(emp1);
            System.out.println(list.toString());

            List<Employee> list1 = empsNew1.getEmpList();
            emp1.setName("Sandeep1");
            emp1.setDept("Computer1");
            emp1.setAge(41);
            emp1.setSalary(300001);
            list1.add(emp1);
            list.remove(emp1);
            System.out.println(list1.toString());

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
