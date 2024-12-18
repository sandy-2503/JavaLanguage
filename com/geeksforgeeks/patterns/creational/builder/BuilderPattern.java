package com.geeksforgeeks.patterns.creational.builder;

public class BuilderPattern {
    public static void main(String[] args) {
        Food food = new Food.Builder("Maggi").setCalories(300).setWeight(200).build();
        System.out.println(food.toString());
    }
}
