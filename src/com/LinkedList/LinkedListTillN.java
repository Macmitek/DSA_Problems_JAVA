package com.LinkedList;

public class LinkedListTillN {

    static  class Node{
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        int N = 5;
        createLL(N);
        //int res = size();
        printLL();
    }
    public static Node createLL(int N){
        Node head = new Node(1);
        Node prev = head;
        for(int i=2;i<=N;i++){
            Node temp = new Node(i);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }
//    public  static  int size(Node head){
//        int cnt = 0;
//        while(head!=null){
//            cnt++;
//            head = head.next;
//        }
//        return cnt;
//    }
    public static void printLL(){

    }

}
