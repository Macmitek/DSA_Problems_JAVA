package com.TwoDMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();

        int res[][] = solve(A);
        int N = res.length;

        for (int i=0;i<N;i++){
            System.out.println();
            for(int j=0;j<N;j++){
                System.out.print("    "+res[i][j]);
            }
        }
    }
    public static int[][] solve(int A) {
        int n = A;
        int res[][] = new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j] = 0;
            }
        }
        int k=1;
        int upper_bound = 0;
        int left_bound = 0;
        int right_bound = n-1;
        int bottom_bound = n-1;

        while(true){
            for(int col=left_bound;col<=right_bound;col++){
                res[upper_bound][col] = k;
                k++;
            }
            upper_bound++;

            for(int row=upper_bound;row<=bottom_bound;row++){
                res[row][right_bound] = k;
                k++;
            }
            right_bound--;

            for(int col=right_bound;col>=left_bound;col--){
                res[bottom_bound][col] = k;
                k++;
            }
            bottom_bound--;

            for(int row=bottom_bound;row>=upper_bound;row--){
                res[row][left_bound] = k;
                k++;
            }
            left_bound++;

            if(k>A*A) break;
        }

        return res;
    }
}
