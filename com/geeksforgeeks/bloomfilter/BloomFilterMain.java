package com.geeksforgeeks.bloomfilter;

public class BloomFilterMain {
    public static void main(String[] args) {
        BloomFilter bloomFilter = new BloomFilter(1000);
        bloomFilter.mark(141432);
        bloomFilter.mark(2354364);
        System.out.println(bloomFilter.isMarked(141432));
        System.out.println(bloomFilter.isMarked(723));
        //This should be false, but bloom filters provide no guarantee on definite existence
        System.out.println(bloomFilter.isMarked(1432));


        System.out.println((1000 + 63) >> 6);
        System.out.println(63>>6);
        System.out.println(Integer.toBinaryString(163));
    }
}
