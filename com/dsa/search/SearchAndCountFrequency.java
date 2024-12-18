package com.dsa.search;

public class SearchAndCountFrequency {

    public static void main(String[] args) {
         int arr[] = { 8, 9, 10, 12,12, 12, 12 };
        //int arr[] = { 1, 3,4 };
        int target = 12;
        int result = countFreq(arr, target);
        System.out.println(result);
    }

    public static int countFreq(int[] arr, int target) {
        int countFreq = 0;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == target) {
                countFreq++;
            }
            if (arr[j] == target) {
                countFreq++;
            }
            j--;
        }
        if (arr.length % 2 != 0) {
            if (arr[(arr.length / 2)] == target) {
                countFreq++;
            }
        }
        return countFreq;
    }
}
