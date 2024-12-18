package com.dsa.arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int arr1[] = {1, 4, 3, 2, 6, 5};
        int lastZeroPosition=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != 0 ){
                swap(arr,i,lastZeroPosition);
                lastZeroPosition++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("====Reverse Array=====");
        reverseArray(arr1);
        Arrays.stream(arr1).forEach(System.out::println);
    }

    public static void swap(int arr[], int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
//1, 4, 3, 2, 6, 5
    public static void reverseArray(int arr[]){
        int reverseCounter =arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            if(reverseCounter>=i){
                swap(arr,i,reverseCounter);
            }
            reverseCounter--;
        }
    }
}
