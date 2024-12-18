package com.geeksforgeeks.patterns.creational.singlton;

class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton object created");
    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return  instance;
    }
}


