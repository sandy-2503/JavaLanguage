package com.dsa.trees;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int newData){
        data = newData;
        left=null;
        right=null;
    }

    public static Node insert(Node root, int data){
        if (root==null) {
            root = new Node(data);

        }else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }
}
