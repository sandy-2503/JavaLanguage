package com.sandeep.java8.streamclass;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        // Using Stream API to find the maximum number
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Max number is: " + max);
    }
}
