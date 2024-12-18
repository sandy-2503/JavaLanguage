package com.geeksforgeeks.patterns.creational.factory;

public class TrainDelivery implements Delivery{
    @Override
    public void delivered() {
        System.out.println("Delivered by Train");
    }
}
