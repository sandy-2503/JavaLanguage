package com.sandeep.java8.streamclass;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthGivenStringArray {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "watermelon"};
        String longestString = findLongestString(strings);
        System.out.println("Longest string is: " + longestString);
    }

    public static String findLongestString(String[] strings) {
        return Arrays.stream(strings)
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException("Array is empty"));
    }
}
