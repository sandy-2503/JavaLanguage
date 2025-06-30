package com.dsa.twopointertechnique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SumPairClosestTarget {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;
        System.out.println(sumClosest(arr, target));
    }
    public static List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int pos1=-1,pos2=-1,preTarget=Integer.MAX_VALUE,currentTarget=-1;
        for(int i=0;i<arr.length-1; i++){
            currentTarget =arr[i]+arr[i+1]-target;
            if( currentTarget < preTarget){
                preTarget = Math.abs(currentTarget);
                pos1=arr[i];
                pos2=arr[i+1];
            }
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(pos1);
        temp.add(pos2);
        Collections.sort(temp);
        return temp;
    }
}
