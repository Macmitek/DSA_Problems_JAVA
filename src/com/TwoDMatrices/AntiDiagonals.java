package com.TwoDMatrices;

import java.util.Scanner;

public class AntiDiagonals {

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
        int r1 = res.length;
        int c1 = res[0].length;
        for (int i=0;i<r1;i++){
            System.out.println();
            for(int j=0;j<c1;j++){
                System.out.print("   "+res[i][j]);
            }
        }


    }
    public static int[][] solve(int[][] A) {
        int n = A.length;
        int res[][] = new int[2*n-1][n];
        for (int i=0;i<2*n-1;i++){
            for(int j=0;j<n;j++){
                res[i][j] = 0;
            }
        }
        for (int sum = 0;sum<=2*n-2;sum++){
            int k=0;

            for(int row=0;row<n;row++){
                int col = sum-row;
                if(col<0 || col>=n) continue;

                res[sum][k] = A[row][col];
                k++;
            }
        }
        return res;
    }
}
