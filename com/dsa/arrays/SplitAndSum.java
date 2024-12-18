package com.dsa.arrays;

public class SplitAndSum {
    static  int findSum(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(" Sum of Array Element = "+sum);
        return sum;
    }
    static int findArrayIndex(int arr[]){
        int leftSum=findSum(arr), rightSum = 0,index=-1;
        for (int j = 0; j < arr.length; j++) {
            leftSum -= arr[j];
            rightSum +=arr[j];
            if(leftSum == rightSum){
                index = j;
                System.out.println("Array index "+j);
            }
        }
        return index;
    }

    static int findArrayIndexForSpecific(int arr[],int s){
        int leftSum=findSum(arr), rightSum = 0,index=-1;
        for (int j = 0; j < arr.length; j++) {
            leftSum -= arr[j];
            rightSum +=arr[j];
            if(leftSum == s && rightSum == s){
                index = j;
                System.out.println("Array index "+j);
            }
        }
        if(leftSum == rightSum){
            System.out.println("Not possible");
        }
        return index;
    }

    public static void main(String args[])
    {
        int i;
        int arr[] = { 10, 20, 30, 40, 20 };
        //int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int key = 30;
        //findArrayIndex(arr);
        findArrayIndexForSpecific(arr,60);
    }
}
