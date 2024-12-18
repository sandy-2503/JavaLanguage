package com.sandeep.concurretex;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    public static void main(String []arg){
        final CountDownLatch latch = new CountDownLatch(4);
        Thread s1 = new Thread(new CountDownService("S1",3000,latch));
        Thread s2 = new Thread(new CountDownService("S2",1000,latch));
        Thread s3 = new Thread(new CountDownService("S3",1000,latch));
        Thread s4 = new Thread(new CountDownService("S4",1000,latch));
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        /*
       If we have a requirement that an application should not start processing any thread until all service is up
       & ready to do their job. We can use CountdownLatch, in this example, the main thread will start with count 4
       and wait until the count reaches zero. Each thread once up and read will do a count down.
       This will ensure that the main thread is not started processing until all services is up.
       */
        try {
            latch.await();
            System.out.println("All services are up..Application is starting now!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
