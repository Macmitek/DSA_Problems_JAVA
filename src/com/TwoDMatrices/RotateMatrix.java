package com.TwoDMatrices;

import java.util.Scanner;

public class RotateMatrix {

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
            System.out.println();
            for(int j=0;j<c;j++){
                System.out.print(" "+res[i][j]);
            }
        }


    }
    public static int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++){

            for (int j = i + 1; j < M; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }


        int col = A[0].length;

        for(int i=0;i<A.length;i++){
            for (int j = 0 ; j < col/2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][col-j-1];
                A[i][col-j-1]= temp;
            }
        }
        return A;
    }
}
