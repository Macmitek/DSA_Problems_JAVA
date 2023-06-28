package com.DynamicP;


import java.util.Arrays;

public class LPS {
    static int[][] dp;
    public static void main(String[] args) {
        String A = "ccdbaeeceecabaacebcaebdceaacdcdcbbadcebcaaceaebcdacccaedcbccacedaacdbaaeacdbeedccceeabececcc";
        int res = solve(A);
        System.out.println("The ans is : " + res);
    }

    public static int solve(String A) {
        int la = A.length();
        if(la==0) return  1;
        int start = 0;
        int end = A.length()-1;
        dp =  new int[la+1][la+1];
        for(int[] rows: dp){
            Arrays.fill(rows,-1);
        }

        return helper(A,start,end);
    }

    public static int helper(String A, int s, int e) {
        if (s == e) {
            return 1;
        }
        if (s > e) {
            return 0;
        }

        if(dp[s][e] == -1 ){
            if (A.charAt(s) == A.charAt(e)) {
                dp[s][e]=  2 + helper(A, s+1,e-1);
            }else{
                dp[s][e] =  Math.max(helper(A, s, e-1) , helper(A, s+1,e ));
            }
        }

        return dp[s][e];
    }
}
