package com.TwoDMatrices;

import java.util.Scanner;

public class Multiplication {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column for 1st : ");
        int M = sc.nextInt();
        int N = sc.nextInt();
        System.out.println("Enter Column for 2nd : ");
        int P = sc.nextInt();

        int A[][]  = new int[M][N];
        int B[][]  = new int[N][P];

        System.out.println("Enter matrices 1 Data::");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrices 2 Data::");
        for(int i=0;i<N;i++){
            for(int j=0;j<P;j++){
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output is : ");
        int res[][] = solve(A,B);
        int n = res.length;
        for(int i=0;i<M;i++){
            System.out.println();
            for(int j=0;j<P;j++){
                System.out.print(" "+res[i][j]);
            }
        }

    }
    public static int[][] solve(int[][] A,int[][] B) {

        int r = A.length;
        int acol = A[0].length;
        int c = B[0].length;
        int[][] mul = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<acol;k++){

                    mul[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return mul  ;
    }
}
