package com.geeksforgeeks.patterns.structural.facade;

public class NonVegRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
