package com.dsa.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
        Given an array arr[] of positive integers and another integer target.
        Determine if there exists two distinct indices such that the sum of there
        elements is equals to target.
    */
public class TwoSumPairwithGivenSum {
    public static void main(String[] args) {
        int []arr ={1, 2, 4, 3, 6};
        int target = 11;
        System.out.println(twoSum(arr, target));
    }

    public static  boolean twoSum(int arr[], int target) {
        boolean result = Boolean.FALSE;
        HashSet<Integer> count = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target-arr[i];
            if(count.contains(temp)){
                result = Boolean.TRUE;
            }else{
                count.add(arr[i]);
            }
        }
        return result;
    }
}
