package com.geeksforgeeks.patterns.structural.decorator;

public class CommonBook implements Book{
    @Override
    public String getDescription() {
        return "Drawing book for all";
    }

    @Override
    public double getPrice() {
        return 100.50;
    }
}
