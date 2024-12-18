package com.dsa.arrays;

public class ArrayIsSubarray {
    public  static boolean isSubArray(int a[],int b[]){
        boolean isSubArray = Boolean.FALSE;
        int aPointer=0,bPointer=0;
        int j=0;
        for (int i = 0; i < a.length; i++) {
            while(aPointer<a.length && bPointer<b.length && a[i] == b[j]){
                System.out.println(a[i] +"-"+b[j]);
                aPointer++;
                bPointer++;
                j++;
                i++;
            }
            if(aPointer == a.length || bPointer == b.length){
                isSubArray = Boolean.TRUE;
            }else{
                aPointer= bPointer=0;
            }
        }
        return isSubArray;
    }
    public static void main(String[] args) {
        int[] A = {2, 3, 0, 5, 1, 1, 2};
        int[] B = {3, 0, 5, 1,1,1};

        if (isSubArray(A, B))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
