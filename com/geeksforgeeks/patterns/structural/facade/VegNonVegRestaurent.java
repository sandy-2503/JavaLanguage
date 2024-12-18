package com.geeksforgeeks.patterns.structural.facade;

public class VegNonVegRestaurent implements Hotel{

    @Override
    public Menu getMenu() {
        BothMenu bothMenu = new BothMenu();
        return bothMenu;
    }
}
