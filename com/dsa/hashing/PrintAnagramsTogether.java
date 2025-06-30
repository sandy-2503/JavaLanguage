package com.dsa.hashing;
/*
    Given an array of strings, return all groups of strings that are anagrams.
    The strings in each group must be arranged in the order of their appearance
    in the original array. Refer to the sample case for clarification.

    Examples:

    Input: arr[] = ["act", "god", "cat", "dog", "tac"]
    Output: [["act", "cat", "tac"], ["god", "dog"]]
    Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
*/
import java.util.*;

public class PrintAnagramsTogether {
    static final int MAX_CHAR = 26;
    public static void main(String[] args) {
        String arr[] = new String[]{"act", "god", "cat", "dog", "tac"};
        System.out.println(anagrams(arr));
    }

    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String temp = generateHash(arr[i]);
            if (!map.containsKey(temp)) {
                map.put(temp, res.size());
                res.add(new ArrayList<>());
            }
            res.get(map.get(temp)).add(arr[i]);
        }
        return res;
    }

    static String generateHash(String s) {
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[MAX_CHAR];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            hash.append(freq[i]);
            hash.append("$");
        }
        return hash.toString();
    }
}
