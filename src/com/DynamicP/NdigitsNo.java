package com.DynamicP;

import java.util.Arrays;

public class NdigitsNo {
    static int[][] dp ;
    static int mod = 1000*1000*1000 + 7;
    public static void main(String[] args) {
        int A =2;
        int B = 4;
        int res = solve(A,B);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(" "+dp[i][j]);
            }
            System.out.println();
        }
        System.out.println("the ans is:"+res);
    }
        public  static int solve(int A, int B) {
            dp = new int[A+1][B+1];
            for(int rows[]: dp){
                Arrays.fill(rows,-1);
            }
            return helper(A,B)%mod;
        }
        public  static int helper(int no_of_digits, int sum){
            if(no_of_digits == 0 && sum == 0){
                return 1;
            }
            if(no_of_digits <= 0 || sum<=0 ){
                return 0;
            }
            if(dp[no_of_digits][sum]!=-1){
                return dp[no_of_digits][sum];
            }
            int ans = 0;
            for(int i=0;i<=9;i++){
                ans = (ans%mod + helper(no_of_digits-1,sum-i)%mod)%mod;
            }
            dp[no_of_digits][sum] = ans%mod;
            return dp[no_of_digits][sum];
        }
}