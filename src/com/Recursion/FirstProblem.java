package com.Recursion;

import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int res = solve(N);
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
        public static int solve(int N){

            if(N==1){
                return 0;
            }
            if(N==2){
                return 1;
            }
            return solve(N-1)+ solve(N-2);
        }
}
