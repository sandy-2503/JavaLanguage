package com.dsa.arrays;

public class MaxProductOfConfinuesSubArray {
    public static void main(String []arg) {
//        int[] arr = {8, 5, 9, 10, 5, 6, 19, 8};
        int [] arr ={-2,4,4};
//        int [] arr ={-2, 6, -3, -10, 0, 2};
        int n = arr.length;

        System.out.print(maxProductOfContinuesSubArray(arr));
    }

    // Using traversing in both directions -2, 6, -3, -10, 0, 2
    public  static int maxProductOfContinuesSubArray(int [] arr){
        int maxProd = Integer.MIN_VALUE;
        int leftToRight = 1;
        int rightToLeft = 1;
        int leftCounter=arr.length-1;
        for (int i = 0; i < arr.length; i++,leftCounter--) {
            if(leftToRight == 0){
                leftToRight=1;
            }
            if(rightToLeft == 0){
                rightToLeft=1;
            }
            leftToRight=leftToRight*arr[i];
            rightToLeft=rightToLeft*arr[leftCounter];

            maxProd = Math.max(leftToRight,Math.max(rightToLeft, maxProd));
        }
        return maxProd;
    }
}
