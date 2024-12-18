package com.geeksforgeeks.ditributedlock;


import org.apache.zookeeper.ZooKeeper;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import java.util.concurrent.TimeUnit;

public class DistributedLock {
    private CuratorFramework client;
    private InterProcessMutex lock;
    public DistributedLock(String zkConnectionString, String lockPath) {
        client = CuratorFrameworkFactory.newClient(zkConnectionString, new ExponentialBackoffRetry(1000, 3));
        client.start();
        lock = new InterProcessMutex(client, lockPath);
    }
    public boolean acquire(long waitTime, TimeUnit timeUnit) {
        try {
            return lock.acquire(waitTime, timeUnit);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void release() {
        try {
            lock.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close() {
        client.close();
    }
}
