package com.geeksforgeeks.patterns.structural.facade;

public class HotelKeeperImplementation implements HotelKeeper{
    @Override
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenu();
        return vegMenu;
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegRestaurant.getMenu();
        return null;
    }

    @Override
    public BothMenu getVegNonMenu() {
        VegNonVegRestaurent vegNonVegRestaurent = new VegNonVegRestaurent();
        BothMenu bothMenu = (BothMenu) vegNonVegRestaurent.getMenu();
        return bothMenu;
    }
}
