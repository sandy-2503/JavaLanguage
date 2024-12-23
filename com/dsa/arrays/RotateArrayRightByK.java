package com.dsa.arrays;

import java.util.StringJoiner;

public class RotateArrayRightByK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5,6,7};
        int d=3;
        rotateArrayByDSteps(arr,d);
        printArray(arr);
    }
    public static void rotateArrayByDSteps(int nums[], int k){
        int n = nums.length;
        k %= n;
        reversePortion(nums, 0, n-k-1 );
        reversePortion(nums, n-k, n - 1);
        reversePortion(nums, 0, n - 1);
    }

    static void reversePortion(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[]){
        StringJoiner sj = new StringJoiner(",");
        for (int i = 0; i < arr.length; i++) {
            sj.add(""+arr[i]);
        }
        System.out.println(sj);
    }
}
