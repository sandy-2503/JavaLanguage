package com.dsa.arrays;

public class StockBuySellMaxOneTxnAllowed {
    public static void main(String []arg) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
//        int[] arr = {7, 6, 4, 3, 1};
//        int [] arr = {1, 3, 6, 9, 11};
        int n = arr.length;

        System.out.print(stockBuySellMaxOneTxnAllowed(arr, n));
    }
    public  static int stockBuySellMaxOneTxnAllowed(int [] prices,int n){
        int minTillNow = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            minTillNow = Math.min(minTillNow, prices[i]);
            result = Math.max(result, prices[i] - minTillNow);
        }
        return result;
    }
}
