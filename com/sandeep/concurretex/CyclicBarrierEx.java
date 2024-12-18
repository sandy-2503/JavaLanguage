package com.sandeep.concurretex;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {
    public static void main(String []arg){
        CyclicBarrier barrier = new CyclicBarrier(4);
        CyclicBarrierParty party1 = new CyclicBarrierParty(barrier,1000,"Party1");
        CyclicBarrierParty party2 = new CyclicBarrierParty(barrier,3000,"Party2");
        CyclicBarrierParty party3 = new CyclicBarrierParty(barrier,2000,"Party3");
        CyclicBarrierParty party4 = new CyclicBarrierParty(barrier,4000,"Party4");

        party1.start();
        party2.start();
        party3.start();
        party4.start();

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}
