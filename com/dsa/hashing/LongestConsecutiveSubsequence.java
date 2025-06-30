package com.dsa.hashing;

import java.util.*;

/*
    Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such
    that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
    Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
    Output: 6
    Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
 */
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int []arr ={53,57,77,15,78,58,17,63,90,73,68,82,40,68,22,52,81,92,80,37,62,17,76,67,55,56,20,22,37,71,65,7,30,93,1,1,90,46,36,74,0,37,76,69,39,97,39,30,14,89,74,71,27,79,51,45,51,54,90,35,68,38,7,82,55,65,14,40,20,64,89,95,8,43,14,88,5,24,72,9,56,17,60,91,16,94,47,15,33};
        System.out.println(longestConsecutiveSubsequence(arr));
    }
    public static  int longestConsecutiveSubsequenceUsingSet(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        List<Integer> ls = set.stream().toList();
        int currentSeq=1,maxSeq=0;
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i+1)-ls.get(i) == 1){
                currentSeq++;
            }else {
                if(currentSeq>maxSeq){
                    maxSeq = currentSeq;
                }
                currentSeq=1;
            }
            if(currentSeq>maxSeq){
                maxSeq = currentSeq;
            }
        }
        return maxSeq;
    }
    public static  int longestConsecutiveSubsequence(int arr[]) {
        Arrays.sort(arr);
        int currentSeq=1,maxSeq=0;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]) {
                continue;
            }
            if(arr[i+1]-arr[i] == 1){
                currentSeq++;
            }else {
                currentSeq=1;
            }
            maxSeq = Math.max(maxSeq, currentSeq);
        }
        return maxSeq;
    }

}
