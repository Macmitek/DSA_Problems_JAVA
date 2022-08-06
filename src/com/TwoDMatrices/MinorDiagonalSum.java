package com.TwoDMatrices;

import java.util.Scanner;

public class MinorDiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][]  = new int[r][c];
        System.out.println("Enter matrices Data::");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.println("Output is : ");
        int res = solve(mat);
        System.out.println(res);

    }

    public static int solve(int[][] A) {
        int N = A.length;
        int ans = 0;
        for(int i=0;i<N;i++){
            ans = ans + A[i][N-i-1];
        }
        return ans;
    }
}
