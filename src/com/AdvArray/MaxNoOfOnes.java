package com.AdvArray;

import java.util.Scanner;

public class MaxNoOfOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = {{0 ,0, 1, 1}, {0, 0, 0, 1}, {0, 1, 1, 1},{0,0,1,1},{1,1,1,1}};
        int res = solve(a);
        System.out.println("Ans is:" + res);
    }

    public static int solve(int[][] A) {
        int r = A.length;
        int c = A[0].length;

        int ans = 0;
        int row =0;
        int column = c-1;

        while(row<r && column>=0){
            if(A[row][column] == 1){
                column-=1;
                ans=row;
            }
            else {
                row+=1;
            }
        }
        return ans;
    }
}
