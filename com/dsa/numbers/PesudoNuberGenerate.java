package com.dsa.numbers;

public class PesudoNuberGenerate {
    public static void main(String[] args) {
        // b and m are relatively prime
        // a-1 is divisible by all prime factor of m
        // a-1 is a multiple of 4 if m is
//        int a=4,b=3,m=8; not work
        int a=5,b=3,m=7;
        int x0 =0;
        int nextNumber=0;
        for (int i = 0; i < 10; i++) {
            nextNumber = nextNumber*a+b%m;
            nextNumber = nextNumber%m;
            System.out.println(nextNumber);
        }
    }
}
