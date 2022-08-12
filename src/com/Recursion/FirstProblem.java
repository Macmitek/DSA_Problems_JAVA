package com.Recursion;

import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N =sc.next();
        boolean res = solve(N);
        System.out.println("Ans is :"+res);
    }

//    public static int solve(int N){
//
//        if(N<=1){
//            return 1;
//        }
//        return solve(N-1) * N;
//    }
//        public static int solve(int N){
//
//            if(N==1){
//                return 0;
//            }
//            if(N==2){
//                return 1;
//            }
//            return solve(N-1)+ solve(N-2);
//        public static int solve(int N){
//
//            if(N==1){
//                return 0;
//            }
//            if(N==2){
//                return 1;
//            }
//            return solve(N-1)+ solve(N-2);
//        }
//        public static void  solve(int N){
//            if(N==0){
//                return ;
//            }
//            solve(N-1);
//            System.out.println(N);
//
//        }
      public  static boolean solve(String s){
        int n = s.length();
        if(n==1) return true;
        if(s.charAt(0)==s.charAt(n-1))
            return solve(s.substring(1,n-1));
        else
            return false;
    } //c
}
