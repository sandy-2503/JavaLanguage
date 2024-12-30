package com.dsa.arrays;

/*
    Given two arrays a[] and b[], the task is to find the number of elements in the union between
     these two arrays.
    The Union of the two arrays can be defined as the set containing distinct elements from both arrays.
     If there are repetitions, then only one element occurrence should be there in the union.

    Note: Elements of a[] and b[] are not necessarily distinct.

        Examples

        Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
        Output: 5
        Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
    **/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfArraysWithDuplicates {
    public static void main(String[] args) {
        int []a ={1, 2, 3, 4, 5};
        int []b = {1, 2, 3};
        System.out.println(findUnion(a,b));
    }
    public static int findUnion(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hm = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
        }
        al.addAll(set);
        return al.size();
    }
}
