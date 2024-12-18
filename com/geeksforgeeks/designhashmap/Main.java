package com.geeksforgeeks.designhashmap;

import java.util.ArrayList;
import java.util.List;

class Item {
    public int key;
    public int value;

    public Item(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return key+","+value;
    }
}

class HashTable {
    private int size;
    private List<List<Item>> table;

    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList<>(size);
        // Initialize the hash table with empty lists
        for (int i = 0; i < size; i++) {
            table.add(new ArrayList<>());
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void set(int key, int value) {
        int hashIndex = hashFunction(key);
        List<Item> items = table.get(hashIndex);

        for (Item item : items) {
            if (item.key == key) {
                item.value = value; // Update the value if the key already exists
                return;
            }
        }
        // If the key does not exist, add a new item
        items.add(new Item(key, value));
    }

    public int get(int key) throws Exception {
        int hashIndex = hashFunction(key);
        List<Item> items = table.get(hashIndex);

        for (Item item : items) {
            if (item.key == key) {
                return item.value;
            }
        }
        throw new Exception("Key not found");
    }

    public void remove(int key) throws Exception {
        int hashIndex = hashFunction(key);
        List<Item> items = table.get(hashIndex);

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).key == key) {
                items.remove(i);
                return;
            }
        }
        throw new Exception("Key not found");
    }

    @Override
    public String toString(){
        return table.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.set(1,20);
        hashTable.set(1,17);
        hashTable.set(1,15);
        hashTable.set(10,26);

        System.out.println(hashTable.toString());
    }
}
