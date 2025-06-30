package com.sandeep.java8.streamclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class UniqueNumberFromList {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(14);
        list.add(20);
        list.add(15);

        /*Problem Statement: Given an ArrayList of integers,
         find all unique numbers.*/
        List<Integer> filterList = list.stream().distinct().sorted().toList();
        System.out.println(filterList);

        /*Problem Statement: Given an ArrayList of integers,
         find all unique numbers (numbers that appear only once).*/
        List<Integer> filterList1 = list.stream().filter(num-> Collections.frequency(list, num) == 1).collect(Collectors.toList());
        System.out.println(filterList1);
    }
}
