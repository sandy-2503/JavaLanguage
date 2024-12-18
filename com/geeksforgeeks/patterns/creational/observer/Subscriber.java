package com.geeksforgeeks.patterns.creational.observer;

public interface Subscriber {
    public void update();
    public void setPublisher(Publisher pub);
}
