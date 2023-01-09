package com.LinkedList;


public class LinkedListTillN {
    public static  Node head = null;

    static  class Node{
        int data;
        Node next;

       public Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        int N = 10;
        createLL(N);
        size();
        printLL();
    }
    public  static  void size(){
        int cnt = 0;
        Node temp =  head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        System.out.println("the size is :" + cnt);
    }
    public static Node createLL(int N){

        head = new Node(1);
        Node prev = head;
        for(int i=2;i<=N;i++){
            Node temp = new Node(i);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }

    public static void printLL(){
        Node currNode = head;

        while (currNode.next != null) {

            System.out.print(currNode.data);
            System.out.println();
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }

}
