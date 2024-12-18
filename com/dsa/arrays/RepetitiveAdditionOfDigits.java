package com.dsa.arrays;

public class RepetitiveAdditionOfDigits {
    public static void main(String[] args) {
        int n = 67;
        int t =0;
        while (n>0){
            t = t+n%10;
            if(t >9){
                t = getSingleDigit(t);
            }
            n = n/10;
        }
        System.out.println("Result "+t);
    }
    public  static int getSingleDigit(int n){
        int t = n%10;
        n = n/10;
        return  t+n;
    }
}
