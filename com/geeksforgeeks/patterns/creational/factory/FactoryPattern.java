package com.geeksforgeeks.patterns.creational.factory;



public class FactoryPattern {
    public static void main(String[] args) {
        // Normal implementation
        // this code having issue single responsibility, if new method add need to update client code
        Delivery byBus = new BusDelivery();
        Delivery byTrain = new TrainDelivery();
        Delivery byCycle = new CycleDelivered();

        byBus.delivered();
        byTrain.delivered();
        byCycle.delivered();

        System.out.println("Using Factory Pattern");
        // Wiht Factory pattern implementation

        Delivery byBusF = Factory.getDeliveryByType("bus");
        Delivery byTrainF = Factory.getDeliveryByType("train");
        Delivery byCycleF = Factory.getDeliveryByType("cycle");
        byBusF.delivered();
        byTrainF.delivered();
        byCycleF.delivered();
    }
}
