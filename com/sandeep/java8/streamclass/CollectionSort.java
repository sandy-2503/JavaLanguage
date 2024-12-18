package com.sandeep.java8.streamclass;

import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);

        Collections.sort(al,(o1,o2)->(o1<o2)?1:(o1>o2) ?-1:0);

        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);

        TreeSet<Integer> h =
                new TreeSet<Integer>((o1,o2)->(o1<o2)?1:(o1>o2) ?-1:0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + h);

        TreeMap<Integer, String> m =
                new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);


        // Pass a reverse comparator to TreeSet() via a lambda expression
        TreeSet<String> ts=new TreeSet<String>(Comparator.reverseOrder());
        // Add elements to the Treeset
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");

        System.out.println(ts.toString());
    }
}
