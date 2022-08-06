package com.TwoDMatrices;

import java.util.Scanner;

public class ScalerMultiply {

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

        System.out.println("Enter multiply factor: ");
        int x = sc.nextInt();

        System.out.println("Output is : ");
        int res[][] = solve(mat,x);
        int r1 = res.length;
        int c1 = res[0].length;
        for (int i=0;i<r1;i++){
            System.out.println();
            for(int j=0;j<c1;j++){
                System.out.print("   "+res[i][j]);
            }
        }


    }
    public static int[][] solve(int[][] A,int B) {
        int r = A.length;
        int c = A[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j] = B*A[i][j];
            }
        }
        return A;
    }
}
