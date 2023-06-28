package com.DynamicP;

import java.util.Arrays;

public class EDITDistance {
    static  int dp[][];
    public static void main(String[] args) {
        String A = "abdxyl";
        String B = "abcgxl";
        int res = solve(A,B);
        System.out.println( "The ans is:"+res);
    }
    public  static  int solve(String A, String B){
        int i = A.length();
        int j = B.length();
        dp = new int[i+1][j+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return LCS(A,i,B,j);
    }
    public static int LCS(String A, int i, String B, int j){
        if(i==0 && j==0) return 0;
        if(i==0 && j!=0) return j*1;
        if(i!=0 && j==0) return i*1;

        if(dp[i][j] == -1){
            if(A.charAt(i-1)==B.charAt(j-1)){
                dp[i][j] = LCS(A,i-1,B,j-1);
            }
            else{
                dp[i][j] = Math.min(1+LCS(A,i,B,j-1),Math.min(1+LCS(A,i-1,B,j-1),1+LCS(A,i-1,B,j)));
            }
        }
        return dp[i][j];

    }
}
