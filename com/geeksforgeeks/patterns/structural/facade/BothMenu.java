package com.geeksforgeeks.patterns.structural.facade;

public class BothMenu implements Menu{

    @Override
    public String getMenuDetail() {
        return "Veg and Non veg items details";
    }
}
