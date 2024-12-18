package com.geeksforgeeks.patterns.creational.abstructfactory;

class WindowsCheckBox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Painting windows button");
    }
}
