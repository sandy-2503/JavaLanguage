package com.dsa.string;

import java.util.Arrays;

public class AnagramsString {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "tac";
        System.out.println(areAnagrams(s1, s2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        boolean isAnAnagramString = Boolean.FALSE;
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        s1 = new String(c1);
        s2 = new String(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        if (s1.equals(s2)) {
            isAnAnagramString = Boolean.TRUE;
        }
        return isAnAnagramString;
    }
}
