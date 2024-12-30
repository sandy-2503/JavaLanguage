package com.dsa.hashing;

import java.util.*;

public class FindAllTripletsWithZeroSum {
    public static void main(String[] args) {
        int []arr ={0, -1, 2, -3, 1};
        System.out.println(findTripletsBruteForce(arr));
    }
    public static  ArrayList<ArrayList<Integer>> findTriplets(int arr[]) {
        Set<ArrayList<Integer>> resultSet = new HashSet<>();
        int n = arr.length;
        Map<Integer, List<int[]>> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                mp.computeIfAbsent(arr[i] + arr[j],
                        k -> new ArrayList<>()).add(new int[]{i, j});
            }
        }
        for (int i = 0; i < n; i++) {
            int rem = -arr[i];
            if (mp.containsKey(rem)) {
                List<int[]> pairs = mp.get(rem);
                for (int[] p : pairs) {
                    if (p[0] != i && p[1] != i) {
                        ArrayList<Integer> current =
                                new ArrayList<>(Arrays.asList(i, p[0], p[1]));
                        Collections.sort(current);
                        resultSet.add(current);
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
    public static  List<List<Integer>> findTripletsBruteForce(int arr[]) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    //System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> list = Arrays.asList(i,j,k);
                        resultList.add(list);
                    }
                }
            }
        }
        return resultList;
    }
}
