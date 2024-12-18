package com.geeksforgeeks.patterns.creational.factory;

public class Factory {
    public static Delivery getDeliveryByType(String type){
        Delivery delivery;
        switch (type){
            case "bus" : delivery = new BusDelivery();
            case "train" :delivery = new TrainDelivery();
            case "cycle" : delivery =  new CycleDelivered();
            default: delivery = new TrainDelivery();
        }
        return delivery;
    }
}
