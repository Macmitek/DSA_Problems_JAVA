package com.Tree;


public class HeightOfT {
    public static  Node root = null;
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            this.data = item;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

    }

}

