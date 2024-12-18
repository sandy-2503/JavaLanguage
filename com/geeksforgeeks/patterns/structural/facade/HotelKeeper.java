package com.geeksforgeeks.patterns.structural.facade;

public interface HotelKeeper {
    public VegMenu getVegMenu();
    public NonVegMenu getNonVegMenu();
    public BothMenu getVegNonMenu();
}
