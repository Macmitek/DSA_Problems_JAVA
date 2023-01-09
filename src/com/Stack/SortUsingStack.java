package com.Stack;

import java.util.*;

public class SortUsingStack {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(34,3,31,98,92,23));
        ArrayList<Integer >  ans =  solve(A);
        System.out.println(ans);
    }
    public  static  ArrayList<Integer> solve(ArrayList<Integer> A){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        Deque<Integer> tempstk = new ArrayDeque<>();
        for(int i= A.size()-1; i>=0;i--){
            stk.push(A.get(i));
        }
       while (!stk.isEmpty()){
           int temp = stk.pop();
           while(!tempstk.isEmpty() && tempstk.peek()>temp){
               stk.push(tempstk.pop());
           }
           tempstk.push(temp);
       }
       while (!tempstk.isEmpty()){
           ans.add(tempstk.pollLast());
       }
        return ans;
    }
}
