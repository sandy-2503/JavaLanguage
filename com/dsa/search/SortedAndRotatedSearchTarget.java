package com.dsa.search;

public class SortedAndRotatedSearchTarget {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 1, 2, 3, 4};
        //int arr[] = { 1, 3,4 };
        int target = 1;
        int result = sortAndReotedMinimumElement(arr,target);
        System.out.println(result);
    }
    public static int sortAndReotedMinimumElement(int []arr, int target){
        int index = -1;
        int j=arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i] == target){
                index = i;
                break;
            }
            if(arr[j] == target){
                index = j;
                break;
            }
            j--;
        }
        if (arr.length % 2 != 0 && index == -1) {
            if(arr[(arr.length / 2)] == target ) {
                index=arr.length / 2;
            }
        }
        return index;
    }
}
