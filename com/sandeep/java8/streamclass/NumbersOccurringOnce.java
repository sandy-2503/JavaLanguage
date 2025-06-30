package com.sandeep.java8.streamclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersOccurringOnce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        List<Integer> uniqueNumbers = numbers
                .stream()
                .filter(n -> Collections.frequency(numbers, n) == 1)
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
