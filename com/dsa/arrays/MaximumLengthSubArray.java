package com.dsa.arrays;


import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubArray {
    public static int maxLenSubArray(char []arr,int n){
        int subArrayLength =0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                int index = map.get(arr[i]);
                int diff = i-index;
                if(subArrayLength <diff){
                    subArrayLength = diff;
                }
            }else {
                map.put(arr[i], i);
            }
        }
        return subArrayLength+1;
    }
    public static void main(String []arg) {
        char arr[] = {'g', 'e', 'e', 'k', 's'};
        int n = arr.length;
        System.out.print(maxLenSubArray(arr, n));
    }
}
