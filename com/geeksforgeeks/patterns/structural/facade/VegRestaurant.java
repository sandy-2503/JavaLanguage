package com.geeksforgeeks.patterns.structural.facade;

public class VegRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
