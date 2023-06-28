package com.DynamicP;

import java.util.Arrays;

public class DistinctSubsequences {
    static  int[][] dp;
    public static void main(String[] args) {
        String A = "rabbbit";
        String B = "rabbit";
        int res = solve(A, B);
        System.out.println("The ans is : " + res);
    }

    public static int solve(String A, String B) {
        int la = A.length();
        int lb = B.length();
        dp = new int[la+1][lb+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(A, B, la, lb);
    }

    public static int helper(String A, String B, int la, int lb) {
        if (lb == 0) {
            return 1;
        }
        if (la == 0) {
            return 0;
        }

        if(dp[la][lb]==-1){

            if (B.charAt(lb - 1) != A.charAt(la - 1) ) {
                dp[la][lb] =  helper(A, B, la - 1, lb );
            }
            else{
                dp[la][lb] = helper(A, B, la-1, lb )+ helper(A, B, la - 1, lb-1);

            }
            }
            return  dp[la][lb];
    }
}