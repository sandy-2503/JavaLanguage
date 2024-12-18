package com.geeksforgeeks.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEmployee implements Cloneable{
    private List<Employee> employeeList;

    public PrototypeEmployee(){
        employeeList = new ArrayList<>();
    }
    public PrototypeEmployee(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmpList() {
        return employeeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<Employee> empList = new ArrayList<>();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        for (Employee e : this.getEmpList()){
            empList.add(e);
        }
        return new PrototypeEmployee(empList);
    }
}
