package com.dsa.string;

import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        System.out.println(isNonRepeatingCharacter(s1));
    }
    public static char isNonRepeatingCharacter(String s) {
        char isFound = '$';
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() ==1){
                isFound = entry.getKey();
                break;
            }
        }
        return isFound;
    }
}
