package com.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class epam {
    public static void main(String[] args) {
        System.out.println("--------------------1---------------");
        String s = "I am interested123455 to grow in my organization";

        //ArrayList<String>  al = (ArrayList<String>) Arrays.stream(s.split(" ")).toList();
        Comparator<Integer> c = (o1, o2)->{
            if(o1 > o2){
                return -1;
            }else if(o1<o2){
                return 1;
            }else{
                return 0;
            }
        };
        Optional result = Arrays.stream(s.split(" ")).map(n->n.length()).sorted(c).skip(1).findFirst();
        System.out.println(result.get());

        System.out.println("--------------------2---------------");
        String s1 = "sandeep";
        String s2 = new String("sandeep");
        Map<String, String > map = new HashMap<>();
        map.put(s1,"sand");
        map.put(s2, "sandeep");
        System.out.println(map.size());
        System.out.println("--------------------3---------------");
        HashMap<String,String> map1 = new HashMap<>();
        map1.put(new String("a"),"a");
        map1.put(new String("a"),"b");
        System.out.println(map1.size());
        System.out.println("--------------------4---------------");

        String str[] = {"abcd","bcda","java","jave","jaav"};

        //Stream<Object> result1 = Arrays.stream(str).map(n->Arrays.sort(n.toCharArray()));


    }

}
