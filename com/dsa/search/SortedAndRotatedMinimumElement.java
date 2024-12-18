package com.dsa.search;

public class SortedAndRotatedMinimumElement {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };
        //int arr[] = { 1, 3,4 };
        int target = 12;
        int result = sortAndReotedMinimumElement(arr);
        System.out.println(result);
    }
    public static int sortAndReotedMinimumElement(int []arr){
        int min = arr[0];
        int j=arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[j]<min){
                min = arr[j];
            }
            j--;
        }
        System.out.println("min = "+min);
        if (arr.length % 2 != 0) {
            if(arr[(arr.length / 2)]<min ) {
                min=arr[(arr.length / 2)];
            }
        }
        return min;
    }
}
