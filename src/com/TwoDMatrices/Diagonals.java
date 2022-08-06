package com.TwoDMatrices;

import java.util.Scanner;

public class Diagonals {


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
        for(int i=0;i<r;i++){
           System.out.println(mat[i][i]);
        }
        int row = mat.length;
        int col = mat[0].length;
        System.out.println("rowa ere : "+row+"and column are :"+col);
    }
}
