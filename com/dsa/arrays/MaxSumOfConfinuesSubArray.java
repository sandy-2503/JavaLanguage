package com.dsa.arrays;

public class MaxSumOfConfinuesSubArray {
    public static void main(String []arg) {
//        int[] arr = {8, 5, 9, 10, 5, 6, 19, 8};
        int [] arr ={-2,-4};
        int n = arr.length;

        System.out.print(maxSumOfConfinuesSubArray(arr, n));
    }

    public  static int maxSumOfConfinuesSubArray(int [] arr,int n){
        int max =Integer.MIN_VALUE;
        int currentMax=0;
        for (int i = 0; i < arr.length; i++) {
            currentMax = Integer.max(arr[i],currentMax+arr[i]);
            max  = Integer.max(max,currentMax);
        }
        return max;
    }
}
