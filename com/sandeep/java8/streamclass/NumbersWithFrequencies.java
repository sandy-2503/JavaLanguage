package com.sandeep.java8.streamclass;
import java.util.Arrays;
import  java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbersWithFrequencies {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        Map<Integer,Long> result = numbers.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));

        System.out.println(result);
    }
}
