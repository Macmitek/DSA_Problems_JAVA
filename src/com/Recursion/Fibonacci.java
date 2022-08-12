package com.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int res = solve(N);
        System.out.println("Ans is :"+res);
    }
    public  static  int solve(int A){

        if(A==0){
            return 0;
        }
        if(A==1){
            return  1;
        }

        return solve(A-1)+ solve(A-2);
    }
}
