package com.geeksforgeeks.javabasic;

class Ak471{
    public void fire() {
        System.out.println("Fire");
    }
}
class Knife1{
    public void stub(){
        System.out.println("Stub");
    }
}
class  Player1 {
    private Ak471  a;
    private Knife1 k;
    Player1(Ak471 a,Knife1 k){
        this.a =a;
        this.k = k;
    }
    public void fire(){
        a.fire();
    }
    public void stub(){
        k.stub();
    }
}
public class MultiInheritenceWithWrapperClass {
    public static void main(String[] args) {
        Player1 p1 = new Player1(new Ak471(), new Knife1());
        p1.fire();
        p1.stub();
    }
}
