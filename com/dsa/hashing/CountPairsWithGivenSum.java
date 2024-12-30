package com.dsa.hashing;

    /*Given an array arr[] and an integer target.
        You have to find numbers of pairs in array arr[] which sums up to given target.*/
import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int []arr ={1,1,1};
        int target = 2;
        System.out.println(countPairs(arr, target));
    }
    public static  int countPairs(int arr[], int target) {
        Map<Integer, Integer> freqCounter = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (freqCounter.containsKey(target - arr[i])) {
                count += freqCounter.get(target - arr[i]);
            }
            freqCounter.put(arr[i], freqCounter.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
