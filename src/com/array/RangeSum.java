package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1,2,3,4,5};
        int arr[][] = {{0,3},{1,2}};
        long res[] = range(A,arr) ;
        System.out.println("The ans is :"+Arrays.toString(res));

    }
    public static long[] range(int[]  A,int[][] B){
        int N = A.length;
        int M = B.length;

        long PS[] = new long[N];
        PS[0] = A[0];

        for(int i=1;i<N;i++){
            PS[i] = PS[i-1] + A[i];
        }
        System.out.println("The pssarray: "+ Arrays.toString(PS));

        long[] ans = new long[M];
        for(int i = 0; i<M;i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l==0){
                ans[i] = PS[r];
            }
            else{
                ans[i] = PS[r] - PS[l-1];
            }
        }
        return ans;
    }
}
