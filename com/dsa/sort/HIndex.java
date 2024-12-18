package com.dsa.sort;


import java.util.Arrays;

class HIndex {
    static int findHIndex(int[] citations) {

        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;
        while (idx < n && citations[n - 1 - idx] > idx) {
            idx++;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] citations = {6, 0, 3, 5, 3};
        System.out.println(findHIndex(citations));
    }
}