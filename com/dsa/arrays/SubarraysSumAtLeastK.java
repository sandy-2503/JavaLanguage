package com.dsa.arrays;

public class SubarraysSumAtLeastK {
    public static long subarraySum(int arr[], long k){
        long counter=0;
        int sum =0,currentSum =0;
        for (int i = 0; i < arr.length; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                sum +=arr[j];
                if(sum == k){
                    counter++;
                }
            }

        }
        return counter;
    }

    public static int subarraySum(int arr[],long L, long R){
        int counter=0;
        for (long i = L; i <= R; i++) {
            counter += subarraySum(arr, i);
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 7 };
        int[] arr1 ={3, 3, 3};
        int k=10;
//        System.out.println(subarraySum(arr,k));
//        System.out.println(subarraySum(arr1,5));
        int[] a = {1, 8, 7, 3, 4, 7};
        System.out.println(subarraySum(a,25,29));
    }
}
