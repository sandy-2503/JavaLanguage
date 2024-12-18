package com.dsa.arrays;

import com.sandeep.classes.B;

public class SubarrayOfSizeKWithGivenSum {
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum=34,k=4, curr_sum=0;
        boolean isFoundSum = Boolean.FALSE;
        for (int i = 0; i < 4; i++) {
            curr_sum = curr_sum+arr[i];
            if(curr_sum == sum){
                isFoundSum = Boolean.TRUE;
                break;
            }
        }
        for (int i = k; i < arr.length; i++) {
            curr_sum = curr_sum+arr[i] -arr[i-k];
            if(curr_sum == sum){
                isFoundSum = Boolean.TRUE;
                break;
            }
        }
        if(isFoundSum){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
