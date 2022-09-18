package com.AdvArray;

import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int[] A =  new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int res = solve(A);
        System.out.println("Ans is: "+res);
    }
    public static int solve(int[] A){
        int N = A.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j= N-1;j>=0;j--){
                if(A[j]>=A[i]){
                    max = Math.max(max,(j-i));
                }
            }
        }
        return max;
    }
}
