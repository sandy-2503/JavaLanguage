package com.sandeep;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String []arg){
        System.out.println("Hello");
        long time = System.currentTimeMillis();
        int result =1;
        String str = ""+time;
        System.out.println(str);
        for (int i=str.length()-1;i<str.length();i--){
            char c = str.charAt(i);
            int strint = Integer.parseInt(""+c);
            if(strint >= 1&& strint <=6){
                result = strint;
                break;
            }
        }
        System.out.println("result : "+result);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println("Second Highest"+getSecondHigestedFormlist(list));
    }

    public  static int getSecondHigestedFormlist(List<Integer> list){
        int result = list.stream().sorted().limit(2).skip(1).findFirst().get();
        int result1 = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(" Second Highest "+result1);
        return result;
    }
}
