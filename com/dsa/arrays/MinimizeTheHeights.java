package com.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimizeTheHeights {
    public static void main(String[] args) {
        int []arr ={1, 8, 10, 6, 4, 6, 9, 1  };
        int k =7;
        System.out.println(minimizeTheHeights(arr,k ));
    }
    public static  int minimizeTheHeights(int arr[], int k) {
        Arrays.sort(arr);
        return arr[arr.length-1]-(arr[0]+k)-k;
    }
}
