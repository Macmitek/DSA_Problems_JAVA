package com.TwoDMatrices;

import java.util.Scanner;

public class RowwiseSum {

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

        int out[] = solve(mat);
        for(int i =0;i < r;i++){
            System.out.println(" "+out[i]);
        }

    }
    public  static int[] solve(int[][] A){
        int r = A.length;
        int res[] = new int[r];

        for(int i=0;i<r;i++){
                for(int j=0;j<A[i].length;j++){
                    res[i] = res[i] + A[i][j];
                }
            }
        return res;
    }
}
