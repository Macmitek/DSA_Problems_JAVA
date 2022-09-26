package com.AdvMaths;

import java.util.Scanner;

public class Combinations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int res = solve(A,B,C);
        System.out.println("Ans is: "+res);
    }
    public  static  int solve(int n,int r,int m){
        int[][] ans = new int[n+1][r+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i)
                    ans[i][j] = 1;
                else
                    ans[i][j] = (ans[i - 1][j] % m + ans[i - 1][j - 1] % m) % m;
            }
        }
        return ans[n][r] % m;

    }
}
