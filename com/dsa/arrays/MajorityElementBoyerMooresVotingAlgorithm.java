package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementBoyerMooresVotingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> res = findMajorityOfElement(arr);
        for (int ele : res)
            System.out.print(ele + " ");
    }
    static List<Integer> findMajorityOfElement(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int element1=-1, element2=-1;
        int condidate1 =0, condidate2=0;
        for (int i = 0; i < arr.length; i++) {
            if(element1 == arr[i]){
                condidate1++;
            }else if(element2 == arr[i]){
                condidate2++;
            }else{
                element1=arr[i];
            }

        }
        return res;
    }
}
