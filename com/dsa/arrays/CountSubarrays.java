package com.dsa.arrays;

public class CountSubarrays {
    public static int countSubarrays(int arr[],int k){
        int result =0, counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>k){
                counter++;
            }else if(counter != 0){
                result =result+counter*(counter+1)/2;
                counter=0;
            }
        }
        if(counter != 0){
            result =result+counter*(counter+1)/2;
            counter=0;
        }
        return result;
    }
    public static void main (String[] args) {
        int a[] = { 3, 4, 5, 6, 7, 2, 10, 11 };
        int n = a.length;
        int k = 5;

        System.out.println (countSubarrays(a, k));

    }
}
