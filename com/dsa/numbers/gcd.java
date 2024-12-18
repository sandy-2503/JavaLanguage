package com.dsa.numbers;

public class gcd {
    public static void gcd(int a, int b){
        int reminder = a>b ? a%b: b%a;
        while(reminder > 0){
            a = b;
            b = reminder;
            reminder =reminder%a;
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        gcd(24,30);
    }
}
