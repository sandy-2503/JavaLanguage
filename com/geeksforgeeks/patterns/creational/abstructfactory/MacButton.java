package com.geeksforgeeks.patterns.creational.abstructfactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting MAC button");
    }
}
