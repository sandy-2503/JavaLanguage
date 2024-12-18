package com.geeksforgeeks.patterns.creational.observer;

import java.util.ArrayList;
import java.util.List;

public interface Publisher {
    public void register(Subscriber sub);
    public void unRegister(Subscriber sub);
    public void notifySubscriber();
    public Object getUpdate(Subscriber sub);
}
