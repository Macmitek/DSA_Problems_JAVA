package com.AdvArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class maxSubmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int res = solve(arr);
        System.out.println("Ans is:"+res);
    }
    public static int solve(int[][] A){
        int N = A.length;
        int M = A[0].length;

        int[][] pfsum = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(j==0){
                    pfsum[i][j] = A[i][j];
                }
                else{
                    pfsum[i][j] = A[i][j] + pfsum[i][j-1];
                }
            }
        }


        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < M; i++) {
            for (int j = i; j < M; j++) {
                ArrayList<Integer>v = new ArrayList();
                for (int k = 0; k < N; k++) {
                    int el = 0;
                    if (i == 0)
                        el = pfsum[k][j];
                    else
                        el = pfsum[k][j] - pfsum[k][i - 1];
                    v.add(el);
                }
                maxSum = Math.max(maxSum, kadane(v));
            }
        }
        return maxSum;
    }
    public static int kadane(ArrayList<Integer> A){
        int N =  A.size();

        int max = Integer.MIN_VALUE;
        int curr_max = 0;

        for(int i =0 ; i < N; i++){
            curr_max = curr_max + A.get(i);
            max = Math.max(curr_max,max);
            if(curr_max < 0){
                curr_max = 0;
            }
        }
        return max;
    }
}
