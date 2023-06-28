package com.Heap;

import java.util.PriorityQueue;

public class MishaAndCandles {
    public static void main(String[] args) {
        int[] A = {3,2,3};
        int B = 4;
        int res = solve(A,B);
        System.out.println("Ans is: "+res);
    }
    public  static  int solve(int[] A, int B){

        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<A.length;i++){
            pq.add(A[i]);
        }

        while(!pq.isEmpty() && pq.peek()<=B){
            int a  = pq.poll();
            int candies = (a/2);
            ans = ans + candies;
            if(pq.size() > 0){
               int temp = pq.poll() + (a - candies);
               pq.add(temp);
           }
            else
                break;
        }
        return  ans;
    }
}
