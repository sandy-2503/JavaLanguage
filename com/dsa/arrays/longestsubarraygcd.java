package com.dsa.arrays;

import java.util.Arrays;

public class longestsubarraygcd {
    public  static int gcd(int a, int b){
        int gcd=0;
        int max = a>b?a:b;
        int i =1;
        while(i<max){
            if(a%i==0 && b%i==0){
                gcd =i;
            }
            i++;
        }
        return gcd;
    }

    public  static int gcdUsingDivide(int n1, int n2){
        int gcd=0;
        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        gcd =n2;
        return gcd;
    }
    public  static int gcdUsingDivide1(int Num1, int Num2){
        int gcd=0,Temp=0;
        while(Num2 != 0)
        {
            Temp = Num2;
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }
        gcd = Num1;
        return gcd;
    }
    static int findLength(int[] arr, int n)
    {
        // To store the maximum number
        // present in the array
        int x = 0;

        // Finding the maximum element
        for (int i = 0; i < n; i++)
            x = Math.max(x, arr[i]);

        int ans = 0, count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }

        return ans;
    }

    static int largestSubarrayHavingGCDEqualTo1(int[] arr, int n)
    {
        int gcd = arr[0];
        for(int i=1; i<n;i++){
            gcd = gcdUsingDivide1(gcd,arr[i]);
        }
        if(gcd==1) return n;

        return -1;
    }
    public static void main(String[] args) {
//        System.out.println(gcd(8,12));
//        System.out.println(gcdUsingDivide(8,12));
//        System.out.println(gcdUsingDivide1(8,12));

        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 3, 3, 3, 3 };
//        System.out.println("Longest sub-array length for arr1: " + findLength(arr1,arr1.length)); // Output: 2
//        System.out.println("Longest sub-array length for arr2: " + findLength(arr2,arr2.length)); // Output: 4
        System.out.println(largestSubarrayHavingGCDEqualTo1(arr1,arr1.length));
    }
}
