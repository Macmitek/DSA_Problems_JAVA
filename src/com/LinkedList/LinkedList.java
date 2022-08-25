package com.LinkedList;

public class LinkedList {

    public static Node head = null;
    public  static int size=0;

    static class Node {

        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static void insert(int position, int value) {

        if (position >= 1 && position <= size + 1) {
            Node new_node = new Node(value);


            if (position == 1) {
                new_node.next=head;
                head=new_node;
            }
            else {
                Node prev = head;
                for(int i=0;i<position-2;i++){
                    prev = prev.next;
                }
                new_node.next = prev.next;
                prev.next = new_node;
            }
            size++;
        }
    }

    public static  void delete_node(int position){
        if(position>=1 && position<=size){
            if(position==1){
                head = head.next;
            }
            else {
                Node prev = head;
                for(int i=0;i<position-1;i++){
                    prev = prev.next;
                }
                prev.next = prev.next.next;
            }
            size--;
        }
    }

    public static void printList()
    {
        Node currNode = head;

        while (currNode.next != null) {

            System.out.print(currNode.value);
            System.out.println();
            currNode = currNode.next;
        }
        System.out.println(currNode.value);
    }

    public static void main(String[] args)
    {
        insert(1,10);
        insert(2,20);
        insert(3,30);
        insert(4,40);
        insert(5,50);
        System.out.println("///////////////////");
        printList();
        insert(6,60);
        insert(7,70);
        System.out.println("///////////////////");
        printList();

        delete_node(3);
        delete_node(4);

        System.out.println("///////////////////");
        printList();


    }
}
