package com.AdvArray;

import java.util.Scanner;

public class maxSumSubmatrix {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][] A = {{-5,-4,-3},{-1,2,3},{2,2,4}};
        int res = solve(A);
        System.out.println("Ans is:"+res);
    }
    public static int solve(int[][] A){
        int[][] pre = pfsum(A);
        int n = A.length;
        int m = A[0].length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            ans = Math.max(ans,matrixSum(pre,i,j,n-1,m-1));
            }
        }
        return 0;
    }

    public static int matrixSum(int[][] pre,int a1,int b1,int a2,int b2){


        int sum =  pre[a2][b2] - pre[a1-1][b2]- pre[a2][b1-1]+ pre[a1- 1][b1 - 1];
        System.out.println("Sum in matrix sum:"+sum);
        return sum;
    }

    public static int[][] pfsum(int[][] a){
        int n = a.length;//row
        int m = a[0].length;//cols

        int[][] pre = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int  j=1;j<=m;j++){
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + a[i-1][j-1];
            }
        }

        return pre;
    }
}
