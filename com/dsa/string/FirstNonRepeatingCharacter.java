package com.dsa.string;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    private static final int ALL_ALPHABATES = 26;
    public static void main(String[] args) {
        String s1 = "sandeepsf";
        System.out.println(firstNonRepeatingCharacter(s1));
    }
    public static char firstNonRepeatingCharacter(String s) {
        int[] freq = new int[ALL_ALPHABATES];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // This will store frequency of each character
        }
        Arrays.stream(freq).forEach(System.out::println);
        // Check the first character with frequency 1
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }
}
