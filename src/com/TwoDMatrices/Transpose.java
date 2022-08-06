package com.TwoDMatrices;

import java.util.Scanner;

public class Transpose {

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
        int res[][] = solve(mat);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(res[i][j]);
            }
        }


    }
    public static int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < M; j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }

        return A;
    }
}
