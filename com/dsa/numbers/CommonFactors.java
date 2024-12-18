package com.dsa.numbers;

public class CommonFactors {
    public static void commonFactors(int number){
        int factor=3;
        while(number > Math.sqrt(factor)){
            number = number/factor;
            System.out.println(factor);
            factor = factor+2;
        }
    }

    public static void main(String[] args) {
        commonFactors(24);
    }
}
