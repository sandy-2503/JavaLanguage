package com.dsa.arrays;

import java.util.Arrays;

public class RotateArrayByDSteps {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d=2;
        rotateArrayByDSteps(arr,d);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void rotateArrayByDSteps(int arr[],int d){
        int n = arr.length;
        d %= n;
        reversePortion(arr, 0, d - 1);
        reversePortion(arr, d, n - 1);
        reversePortion(arr, 0, n - 1);
    }
    public static void swap(int arr[], int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
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
}
