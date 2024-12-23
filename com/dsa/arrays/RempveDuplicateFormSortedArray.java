package com.dsa.arrays;

public class RempveDuplicateFormSortedArray {
    public static void main(String[] args) {
        int a[] = {1,1,2};
        System.out.println(removeDuplicate(a));

    }

    public static int removeDuplicate(int []nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
