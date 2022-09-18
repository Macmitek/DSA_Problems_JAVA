package com.AdvArray;

import java.util.Scanner;

public class MaxAbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        int res = solve(a);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A){
        int max_A = Integer.MIN_VALUE;
        int max_B = Integer.MIN_VALUE;
        int min_A = Integer.MAX_VALUE;
        int min_B = Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++){
            max_A = Math.max(max_A,A[i]+i);
            max_B = Math.max(max_B,A[i]-i);
            min_A = Math.min(min_A,A[i]+i);
            min_B = Math.min(min_B,A[i]-i);
        }
        int A1 = max_A-min_A;
        int B1 = max_B-min_B;
        return  Math.max(A1,B1);
    }
}


