package com.HashMap;

import java.util.Scanner;

public class ISDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = {"hello","scaler","interviewbit"};
        //String B = sc.nextLine();
        int res = solve(A);
        System.out.println("Ans is :"+res);
    }
    public static int solve(String[] A){
        int N = A.length;
        System.out.println("length:"+N);
        for(int i=0;i<N;i++){
            System.out.println();
            for(int j=0;j<A[i].length();j++){
                System.out.print(" "+A[i].charAt(j));
            }
        }
        return  0;
    }
}
