package com.dsa.arrays;

import java.util.ArrayList;

public class SumOfContinuousArrays {

    static  int findSum(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(" Sum of Array Element = "+sum);
        return sum;
    }

    static ArrayList<Integer> findArrayIndexForSpecific(int arr[],int s){
        ArrayList<Integer> al = new ArrayList<>();
        //1,2,3,7,5 =12
        //1,2,3,4,5,6,7,8,9,10=12
        // 1,2,3,4 = 0
        int  startIndex=-1, endIndex=-1, sum=0;
        startIndex = 0;
        boolean isFindIndex = false;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            endIndex=j;

            while(sum > s && startIndex<j){
                sum =sum - arr[startIndex];
                startIndex++;
            }
            if(sum == s){
                isFindIndex=true;
                al.add(startIndex);
                al.add(endIndex);
                break;
            }
        }
        if( !isFindIndex){
            al.add(-1);
        }
        return al;
    }

    public static void main(String args[])
    {
        int i;
        int arr[] = { 10, 20, 30, 40, 20 };
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};
        int arr3[] = {1,2,3,7,5 };
        int arr4[] = {1,2,3,4 };
        System.out.println("Arr = "+findArrayIndexForSpecific(arr,50).toString());
        System.out.println("Arr2 = "+findArrayIndexForSpecific(arr2,15).toString());
        System.out.println("Arr3 = "+findArrayIndexForSpecific(arr3,12).toString());

        System.out.println("Arr4 = "+findArrayIndexForSpecific(arr4,0).toString());
    }
}
