package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(14);
        list.add(20);
        list.add(15);

        List<Integer> filterList = list.stream().distinct().sorted().toList();


        System.out.println(filterList);

    }
}
