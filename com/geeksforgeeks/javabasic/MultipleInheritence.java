package com.geeksforgeeks.javabasic;

interface Ak47{
    void fire();
}

interface Knife{
    void stub();
}
class Player implements  Ak47,Knife{

    @Override
    public void stub(){
        System.out.println("Stub");
    }

    @Override
    public void fire() {
        System.out.println("Fire");
    }
}
public class MultipleInheritence{

    public static void main(String[] args) {
    Player p = new Player();;
    p.fire();
    p.stub();
    }
}
