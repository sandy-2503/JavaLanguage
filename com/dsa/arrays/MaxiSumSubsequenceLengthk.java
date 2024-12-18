package com.dsa.arrays;

import java.util.*;

// Not working
public class MaxiSumSubsequenceLengthk {
    static int lengthOfLIS(int[] nums) {
        // Binary search approach
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        // Initialize the answer list with the
        // first element of nums
        ans.add(nums[0]);

        for (int i = 1; i < n; i++) {
            if (nums[i] > ans.get(ans.size() - 1)) {
                // If the current number is greater
                // than the last element of the answer
                // list, it means we have found a
                // longer increasing subsequence.
                // Hence, we append the current number
                // to the answer list.
                ans.add(nums[i]);
            } else {
                // If the current number is not
                // greater than the last element of
                // the answer list, we perform
                // a binary search to find the smallest
                // element in the answer list that
                // is greater than or equal to the
                // current number.

                // The binarySearch method returns
                // the index of the first element that is not less than
                // the current number.
                int low = Collections.binarySearch(ans, nums[i]);

                // We update the element at the
                // found position with the current number.
                // By doing this, we are maintaining
                // a sorted order in the answer list.
                if (low < 0) {
                    low = -(low + 1);
                }
                ans.set(low, nums[i]);
            }
        }

        // The size of the answer list
        // represents the length of the
        // longest increasing subsequence.
        System.out.println(ans.toString());
        return ans.size();
    }
    public  static int maxSum(int a[],int k){
        int sum=0, curr_sum=0, currentValue=0;
        List<Integer> list = new ArrayList<>();
        // 5,1,10,1,9,4
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(a[i] >= currentValue) {
                curr_sum = curr_sum + a[i];
                currentValue = a[i];
                if(curr_sum > sum){
                    sum = curr_sum;
                }
                list.add(curr_sum);
            }
            if(i%k==0){
                currentValue = a[i];
            }
        }
        System.out.println(list.toString());
        if (list.size() > k) {
            sum = list.get(list.size()-1)-list.get(list.size()-1-k);
        }else if(list.size() == k) {
            sum = list.get(list.size()-1);
        }else{
            sum = -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] A = {8, 5, 9, 10, 5, 6, 19, 8};
        int[] B = {5,1,10,1,9,4};
        int[] C = {18,20,8};
        int [] D = {27, 7, 16, 2, 9, 6, 10, 20, 28, 10, 28, 17};
        int [] E = {29, 5, 5, 1, 23, 26, 23};
//        System.out.println(maxSum(A,3));
        System.out.println(maxSum(B,3));
//        System.out.println(maxSum(C,2));
//        System.out.println(maxSum(D,2));
//        System.out.println(maxSum(E,2));
        System.out.println(lengthOfLIS(B));
    }
}
