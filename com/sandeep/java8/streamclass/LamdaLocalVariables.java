package com.sandeep.java8.streamclass;

@FunctionalInterface
interface AddInterface{
    public  void add(int a, int b);
}
public class LamdaLocalVariables {
    static int number1 =10;
    public static void main(String[] args) {
        final int number =10;
        AddInterface ai = (a,b)->{
            int v = 10;
             //number= number+a;
            System.out.println(number);
        };
        ai.add(10,25);
    }

}
