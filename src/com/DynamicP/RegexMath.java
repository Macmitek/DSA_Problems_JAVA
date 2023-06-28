package com.DynamicP;

import java.util.Arrays;

public class RegexMath {
     static int[][] dp;
    public static void main(String[] args) {
        String A = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String B = "a**************************************************************************************";
        int res = solve(A,B);
        System.out.println("The ans is : "+res);
    }
    public  static  int solve(String A,String B){
        int la = A.length();
        int lb =  B.length();
        int starAll = 0;
        for(int i=0;i<lb;i++){
            if(B.charAt(i)!='*'){
                starAll=1;
            }
        }
        if(starAll==0) return  1;
        dp= new int[la+1][lb+1];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return  helper(A,B,la,lb);
    }
    public  static  int helper(String A, String B, int la, int lb){
        if(la ==0 && lb ==0){
            return  1;
        }
        else if(lb==0){
            return  0;
        }
        else  if(la==0){
            for(int i=0;i<lb;i++){
                if(B.charAt(i)!='*'){
                    return 0;
                }
            }
            return 1;
        }
        int temp=0;
        if(dp[la][lb]==-1){
            if(B.charAt(lb-1) == A.charAt(la-1) || B.charAt(lb-1)=='?'){
                temp = helper(A,B,la-1,lb-1);
            }
            if(B.charAt(lb-1)=='*'){
               temp = Math.max(helper(A,B,la,lb-1),helper(A,B,la-1,lb));
            }
        }
        dp[la][lb] = temp;
        return dp[la][lb];
    }
}
