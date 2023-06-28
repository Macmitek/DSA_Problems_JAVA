package com.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class RemoveParanthesis {
    public static void main(String[] args) {
        String A = "(a)())()";
        ArrayList<String> ans = solve(A);
        System.out.println("The list is :"+ans);
    }
    public  static ArrayList<String> solve(String A) {
        int off_left = 0;
        int off_right = 0;

        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('){
                off_left++;
            }
            if(A.charAt(i)== ')'){
                if(off_left>0){
                    off_left--;
                }
                else{
                    off_right++;
                }
            }
        }

        HashSet<String> set = new HashSet<>();

        backtrack(0,A, "",off_left, off_right,set,0);
        System.out.println("The final set is :"+set);
        ArrayList<String> anslist = new ArrayList<>();
        anslist.addAll(set);
        return anslist;
    }

    public  static void backtrack(int index, String s,String curr,int off_left, int off_right, HashSet<String> set,int balance){

        if(index== s.length()){
            if(off_left==0 && off_right == 0){
                set.add(curr);
            }
        }else if (balance>=0){
            char ch = s.charAt(index);
            if(ch == '(' && off_left>0){
                backtrack(index+1,s,curr,off_left-1,off_right,set,balance);
            }else if(ch == ')' && off_right>0){
                backtrack(index+1,s,curr,off_left,off_right -1,set,balance);
            }
            int diff = 0;
            if(ch==')'){
                diff= -1;
            }
            if(ch == '('){
                diff = 1;
            }
            backtrack(index+1,s,curr + ch, off_left,off_right,set,balance+diff);
        }
    }

}
