package com.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Athlargestno {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        int A = 4;
        ArrayList<Integer> ans =  solve(A,input);
        System.out.println("the ans is : "+ans);
    }

    public static  ArrayList<Integer> solve(int A, ArrayList<Integer> B){
        ArrayList<Integer> ans = new ArrayList<>() ;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<A-1;i++){
            ans.add(-1);
            minHeap.add(B.get(i));
        }
        System.out.println("minHeap till A-1: "+minHeap);
        minHeap.add(B.get(A-1));
        ans.add(minHeap.peek());
        System.out.println("ans list ans minHeap : "+ans +"  |||  "+minHeap+"" );

        for(int i=A;i<B.size();i++){
            if(minHeap.peek()<B.get(i)){
                minHeap.poll();
                minHeap.add(B.get(i));
            }
            ans.add(minHeap.peek());
        }

        return ans ;
    }
    // Brute force approach
//    public static  ArrayList<Integer> solve(int A, ArrayList<Integer> B){
//        ArrayList<Integer> ans = new ArrayList<>() ;
//
//        for(int i=0; i<B.size(); i++){
//            if(i<A-1)
//                ans.add(-1);
//            else{
//                ArrayList<Integer> list = new ArrayList<>();
//                for(int j=0; j<=i; j++) {
//                    list.add(B.get(j));
//                }
//                System.out.println("list in else : "+list);
//                Collections.sort(list,(a,b)-> b-a);
//                System.out.println("list in else dec : "+list);
//                ans.add(list.get(A-1));
//                System.out.println("anslist in else : "+ans);
//            }
//        }
//        return ans ;
//    }
}
