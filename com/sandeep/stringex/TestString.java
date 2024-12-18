package com.sandeep.stringex;

import java.util.GregorianCalendar;

public class TestString {
    public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        //StringBuffer sb = new StringBuffer(); // Time Taken:1114, Memory used:2967720
        StringBuilder sb = new StringBuilder(); //Time Taken:613, Memory used:2070288
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }
}
