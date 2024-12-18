package com.dsa.arrays;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int [] arr ={2, -3, 4, 1, 1, 7};
//        int []arr = {1, 2, 3, 4, 5};
        System.out.println("Result is : ="+missingNumber(arr,arr.length));
    }

    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int[] arr, int size) {
        int smallNumber = 0;
        int n = arr.length;
//        Arrays.sort(arr);
//        Arrays.stream(arr).forEach(System.out::print);
        boolean flag = Boolean.FALSE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                flag = true;
                break;
            }
        }
        // If 1 is not present
        if (!flag)
            return 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n)
                arr[i] = 1;
        }
        System.out.println("-----");
        for (int i = 0; i < n; i++) {
            System.out.print(","+i);
        }
        for (int i = 0; i < n; i++) {
            arr[(arr[i] - 1) % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n)
                return i + 1;
        }
        return n+1;
    }

}
