package com.sandeep.java8.streamclass;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
