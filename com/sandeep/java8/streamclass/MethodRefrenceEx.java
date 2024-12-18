package com.sandeep.java8.streamclass;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class MethodRefrenceEx {

    static boolean startsWithNew(String s) {
        return s.startsWith("New");
    }

    boolean startsWithNewInstance(String s) {
        return s.startsWith("New");
    }

    public static void main(String[] args) {
        String str = "Example Of A String";
        BiFunction<String, String, Integer> func = String::indexOf;

//        BiFunction<String, String, Integer> func1 = str::indexOf;

        List<String> cities = List.of("Mumbai", "New York", "Paris", "Boston", "New Delhi");

        Predicate<String> newCityPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("New");
            }
        };

        List<String> newCities = cities.stream().filter(newCityPredicate).toList();
        List<String> newCities1 = cities.stream().filter(i->i.startsWith("New")).toList();
        System.out.println(newCities.toString());
        System.out.println(newCities1.toString());

        // 1- using static method
        List<String> newCitiesMethodRef = cities.stream().filter(MethodRefrenceEx::startsWithNew).toList();
        System.out.println(newCitiesMethodRef);

        //2-Using instance method
        MethodRefrenceEx MREInstance = new MethodRefrenceEx();
        List<String> newCitiesMethodInstance = cities.stream().filter(MREInstance::startsWithNewInstance).toList();
        System.out.println(newCitiesMethodInstance);

        // 3- Using class name
        List<City> newCitiesClassName = cities.stream().map(City::new).toList();
        System.out.println(newCitiesClassName);

        //Kind 4 — ContainingType::methodName
        List<String> upperCities = cities.stream().map(String::toUpperCase).toList();
        System.out.println(upperCities);

        BiFunction<String, String, Integer> func2 = String::indexOf;
        Integer result = func2.apply("This is New York", "New York");

// Will output 8
        System.out.println(result);
    }
}
