package com.sandeep.exceptionex;

import java.util.HashMap;

public class OutOfMemoryErrorEx {
    private static HashMap<Object, Object> myMap = new HashMap<>();

    public static void grow() {

        long counter = 0;
        while (true) {

            if (counter % 1000 == 0) {
                System.out.println("counter ="+counter);
                System.out.println("Inserted 1000 Records to map!");
            }
            myMap.put("key" + counter, "Large stringgggggggggggggggggggggggg" + counter);
            ++counter;

        }

    }
    public static void main(String a[]){
        grow();
    }
}
