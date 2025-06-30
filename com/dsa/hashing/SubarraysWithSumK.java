package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithSumK {
    public static void main(String[] args) {
        int arr[] = {9, 4, 20, 3, 10, 5};
        int sum=33;
        System.out.println(countSubarraysUsingHash(arr, sum));
    }
    static public int countSubarraysUsingHash(int arr[], int k) {
        // HashMap to store prefix sums frequencies
        Map<Integer, Integer> prefixSums = new HashMap<>();
        int res = 0;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == k) {
                res++;
            }
            if (prefixSums.containsKey(currSum - k)) {
                res += prefixSums.get(currSum - k);
            }
            prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
        }

        return res;
    }

    static public int countSubarrays(int arr[], int k) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum =sum+arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
