package com.dsa.arrays;


public class MaximumLengthCircularSubArray {
    public static void main(String[] arg) {
        int[] arr = {10, -3, -4, 7, 6, 5, -4, -1};
        int n = arr.length;
        System.out.print(maxSumOfConfinuesCircularSubArray(arr, n));
    }

    public static int maxSumOfConfinuesCircularSubArray(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int i = 0; i < arr.length; i++) {
            currentMax = Integer.max(arr[i], currentMax + arr[i]);
            max = Integer.max(max, currentMax);
        }
        return max;
    }
}
