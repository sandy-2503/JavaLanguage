package com.sandeep.java8.streamclass;

public class LamdaThread {
    static Runnable runnable = ()->{
        System.out.println("Run ");
        System.out.println(Thread.currentThread().getName() + " is running");
    };

    public static void main(String[] args) {
        Thread.currentThread().setName("myThread");
        System.out.println(Thread.currentThread().getName() + " is running");
        Thread t = new Thread(runnable);
        t.start();
    }
}
