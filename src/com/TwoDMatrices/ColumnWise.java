package com.TwoDMatrices;

import java.util.Scanner;

public class ColumnWise {

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
        int res[] = solve(mat);
        int n = res.length;
        for(int i=0;i<n;i++){
            System.out.println("Sum: :"+res[i]);
        }

    }
    public static int[] solve(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int colsum[] = new int[c];
        for(int i = 0; i<c; i++)
        {   int sum = 0;
            for (int j=0 ; j<r; j++)
            {
               sum = sum+ A[j][i];
            }
            colsum[i] = sum;
        }

        return colsum;
    }
}
