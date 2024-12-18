package com.geeksforgeeks.patterns.creational.factory;

public class BusDelivery implements Delivery{
    @Override
    public void delivered() {
        System.out.println("Delivered by Bus");
    }
}
