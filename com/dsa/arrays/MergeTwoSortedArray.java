package com.dsa.arrays;

import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7, 9,0,0,0,0};
        int b[] = {1, 4, 8, 10};
        mergeTwoSortedArray(a,a.length-b.length, b,  b.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void mergeTwoSortedArray(int nums1[], int m, int nums2[], int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

}
