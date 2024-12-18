package com.sandeep.java8.streamclass;

public class City {
    private final String name;

    public City(String name) {
        this.name = name;

        // any other initialization
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "{name:%s}".formatted(name);
    }
}
