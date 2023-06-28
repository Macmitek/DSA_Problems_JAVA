package com.DynamicP;

import java.util.Arrays;

public class LCS {
     static int[][] dp;
    public static void main(String[] args) {
        String A = "AGGTAB";
        String B = "GXTNAYB";
        int res = solve(A,B);
        System.out.println( "The ans is:"+res);
    }
    public  static  int solve(String A, String B){
        int n = A.length();
        int m = B.length();
        int i = n-1;
        int j = m-1;
        dp = new int[n+1][m+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return LCS(A,i,B,j);
    }
    public static int LCS(String A, int i, String B, int j){
        if(i<0 || j<0) return 0;
        if(dp[i][j] == -1){
            if(A.charAt(i)==B.charAt(j)){
                dp[i][j] =  1 + LCS(A,i-1,B,j-1);
            }
            else{
                dp[i][j] = Math.max(LCS(A,i-1,B,j),LCS(A,i,B,j-1));
            }
        }
        return dp[i][j];

    }
}
