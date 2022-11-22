package com.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowQueue {
    public static void main(String[] args) {
        ArrayList<Integer> A=  new ArrayList<>(Arrays.asList(1,3,-1,-3,5,3,6,7));
        int B = 3;
        ArrayList<Integer> res = solve(A,B);
        for(int i : res){
            System.out.print(" "+i);
        }
    }
    public  static  ArrayList<Integer> solve(ArrayList<Integer> A,int B){
        ArrayList<Integer> ans =  new ArrayList<>();
        Deque<Integer> que = new ArrayDeque<>();
        int N = A.size();
        for(int i=0;i<B;i++){
            while(!que.isEmpty() && A.get(que.peekLast()) <=A.get(i) ){
                que.pollLast();
            }
            que.addLast(i);
        }
        ans.add(A.get(que.peekFirst()));

        for (int i = B ; i <N;i++){
            if(que.peekFirst() < i-B+1){
                que.pop();
            }
            while(!que.isEmpty() && A.get(que.peekLast()) <=A.get(i) ){
                que.pollLast();
            }
            que.addLast(i);
            ans.add(A.get(que.peekFirst()));
        }

        return ans;
    }
}
