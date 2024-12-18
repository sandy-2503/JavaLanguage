package com.sandeep.stringex;

abstract class Shape {
    private String color;

    // Constructor in the abstract class
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Calling the constructor of the abstract class
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstructCon {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        System.out.println("Color: " + circle.getColor()); // Output: Color: Red
        System.out.println("Area: " + circle.area());
    }
}

