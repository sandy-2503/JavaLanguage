package com.dsa.twopointertechnique;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public record CountPairsSumLessThanTarget() {
    public static void main(String[] args) {
        int[] arr = {40, 10, 29, 28, 22, 1, 30};
        int target = 54;

        System.out.println(countTriplets(arr, target));
    }
    static int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int result = 0;
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.add(arr[i]);
        }
        int ptrLeft=0,ptrRight=n-1;
        int curSum=0;
        for (int i = 0; i < n; i++) {
            curSum = target-arr[i]-1;
            if(map.contains(curSum)){
                result++;
            }
        }
        System.out.println(map.toString());
        return result;
    }
}
