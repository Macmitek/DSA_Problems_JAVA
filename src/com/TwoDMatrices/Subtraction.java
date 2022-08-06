package com.TwoDMatrices;

import java.util.Scanner;

public class Subtraction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat1[][]  = new int[r][c];
        int mat2[][]  = new int[r][c];

        System.out.println("Enter 1st matrices Data::");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrices Data::");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        int res[][] = solve(mat1,mat2);
        System.out.println("Output is : ");
        for(int i=0;i<r;i++){
            System.out.println();
            for(int j=0;j<c;j++){
                  System.out.print("   "+res[i][j]);
            }
        }

    }

    public static int[][] solve(int[][] A,int[][] B) {
        int r = A.length;
        int c = A[0].length;
        int sub[][] = new int[r][c];
        for(int i = 0; i<r; i++)
        {
            for (int j=0 ; j<c; j++)
            {
                sub[i][j]= A[i][j] - B[i][j];
            }
        }  
        
        return sub;
    }
}
