package com.geeksforgeeks.patterns.creational.factory;

import jdk.jshell.Diag;

public class CycleDelivered implements Delivery {
    @Override
    public void delivered() {
        System.out.println("Delivered by Train");
    }
}
