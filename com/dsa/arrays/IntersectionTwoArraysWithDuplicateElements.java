package com.dsa.arrays;

/*
    Given two integer arrays a[] and b[], you have to find the intersection of the two arrays.
    Intersection of two arrays is said to be elements that are common in both arrays.
    The intersection should not have duplicate elements and the result should contain items in any order.
    Note: The driver code will sort the resulting array in increasing order before printing.

    Examples:

    Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
    Output: [1, 3]
    Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.
*/
import java.util.*;

public class IntersectionTwoArraysWithDuplicateElements {
    public static void main(String[] args) {
        int []a ={1, 2, 1, 3, 1};
        int []b = {3, 1, 3, 4, 1};
        intersectionWithDuplicates(a,b).stream().forEach(System.out::println);
    }
    public static ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hm = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < b.length; i++) {
            hm.add(b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if(hm.contains(a[i])){
                set.add(a[i]);
            }
        }
        al.addAll(set);
        return al;
    }
}
