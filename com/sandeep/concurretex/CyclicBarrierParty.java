package com.sandeep.concurretex;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierParty extends Thread{

    private final int duration;
    private CyclicBarrier barrier;

    public CyclicBarrierParty(CyclicBarrier barrier, int duration,String name) {
        super(name);
        this.barrier = barrier;
        this.duration = duration;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration);
            System.out.println(Thread.currentThread().getName()+" is calling await.");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has started running again");
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
