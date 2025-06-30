package com.sandeep.java8.streamclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbersFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        List<Integer> duplicate = numbers.stream().filter(n->
                numbers.stream().filter(n1->n1.equals(n)).count() > 1).distinct().toList();
        System.out.println(duplicate);

        Set<Integer> duplicates = numbers
                .stream()
                .filter(num-> Collections.frequency(numbers, num) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
