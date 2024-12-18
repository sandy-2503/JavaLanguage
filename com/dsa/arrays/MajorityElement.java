package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> res = findMajorityOfElement(arr);
        for (int ele : res)
            System.out.print(ele + " ");
    }
    static List<Integer> findMajorityOfElement(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int ele : arr){
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        int count=0;
        int element =0;
        for (Map.Entry<Integer, Integer> it : freq.entrySet()) {
            element = it.getKey();
            count=it.getValue();
            if(count > arr.length/3){
                res.add(element);
            }
        }
        return res;
    }
}
