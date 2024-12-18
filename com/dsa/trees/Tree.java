package com.dsa.trees;

public class Tree {
    static Node root;

    public static void main(String[] args) {
        root = new Node(10);
        root = Node.insert(root,30);
    }
}
