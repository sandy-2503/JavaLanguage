package com.geeksforgeeks.patterns.creational.abstructfactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting windows Button");
    }
}
