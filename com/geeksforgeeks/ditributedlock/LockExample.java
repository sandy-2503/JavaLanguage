package com.geeksforgeeks.ditributedlock;


import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.concurrent.TimeUnit;

public class LockExample {
    public static void main(String[] args) {
        String zkConnectionString = "127.0.0.1:2181";
        String lockPath = "/my_resource_lock";

        DistributedLock lock = new DistributedLock(zkConnectionString, lockPath);
        // Acquire the lock
        if (lock.acquire(100, TimeUnit.MILLISECONDS)) {
            // Access the shared resource
            // Perform your operations here
            // Release the lock
            lock.release();
        }
        // Close the ZooKeeper connection
        lock.close();
    }
}
