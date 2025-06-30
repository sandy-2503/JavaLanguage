package com.dsa.hashing;

import java.util.HashMap;

/*
    Given an array of integers arr[] and a number k, count the number of subarrays
    having XOR of their elements as k.

    Examples:
    Input: arr[] = [4, 2, 2, 6, 4], k = 6
    Output: 4
    Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6],
    and [6]. Hence, the answer is 4.
*/
public class CountSubarraysWithGivenXOR {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k=4;
        System.out.println(subarrayXor(arr,k));
    }
    static public long subarrayXor(int arr[], int k) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int prefxor = 0;
            for (int j = i; j < arr.length; j++) {
                prefxor = prefxor^arr[j];
                if(prefxor == k){
                    count++;
                }
            }
        }
        return count;
    }

    static int subarrayXorHashMap(int[] arr, int k) {
        int res = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        int prefXOR = 0;

        for (int val : arr) {
            prefXOR ^= val;
            res += mp.getOrDefault(prefXOR ^ k, 0);
            if (prefXOR == k) {
                res++;
            }
            mp.put(prefXOR, mp.getOrDefault(prefXOR, 0) + 1);
        }

        return res;
    }
}
