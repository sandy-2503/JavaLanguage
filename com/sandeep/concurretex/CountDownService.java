package com.sandeep.concurretex;

import java.util.concurrent.CountDownLatch;

public class CountDownService implements  Runnable{

    private final String ServiceName;
    private final int timeToStart;
    private  final CountDownLatch latch;

    public CountDownService(String serviceName, int timeToStart, CountDownLatch latch) {
        ServiceName = serviceName;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeToStart);
        } catch (InterruptedException e) {

            System.out.println(" InterruptedException : "+CountDownLatch.class.getName());
        }
        System.out.println("ServiceName :"+ServiceName);
        latch.countDown();
    }
}
