package com.sandeep.concurretex;

public class TheadsInSystem {
    public static void main(String []arg){
        int threads = Runtime.getRuntime().availableProcessors();
        System.out.println("No of Threads in system "+threads);
    }
}
