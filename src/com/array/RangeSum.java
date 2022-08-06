package com.array;

import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int NQ = sc.nextInt();
        int arr[][] = new int[NQ][2];

        for (int i=0;i<NQ;i++) {
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<NQ;i++) {
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        long res[] = range(A,arr) ;


        for (int i=0;i< res.length;i++) {
            System.out.println(res[i]);
        }

    }
    public static long[] range(int[]  A,int[][] B){
        int N = A.length;
        int M = B.length;

        long PS[] = new long[N];
        PS[0] = A[0];

        for(int i=1;i<N;i++){
            PS[i] = PS[i-1] + A[i];
        }
        long[] ans = new long[M];
        for(int i = 0; i<M;i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l==1){
                ans[i] = PS[r-1];
            }
            else{
                ans[i] = PS[r-1] - PS[l-2];
            }
        }
        return ans;

    }
}
