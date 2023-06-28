package com.DynamicP;

import java.util.ArrayList;
import java.util.Arrays;

public class NoOfwaystodecode {
    public static void main(String[] args) {
        String A = "121317";
        int res = solve(A);
        System.out.println("the ans is :"+res);
    }

    public static int solve(String A){
        int n = A.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1); // initialize dp array with -1
        dp[0] = 1; // initialize base case for subproblem of length 0
        dp[1] = A.charAt(0) != '0' ? 1 : 0; // initialize base case for subproblem of length 1
        return helper(n, A, dp);
    }

    public static int helper(int i, String A, int[] dp){

        if (dp[i] != -1) {
            return dp[i];
        }

        int count = 0;

        if (i == 0) {
            count = 1;
        }
        else if (i == 1) {
            count = A.charAt(0) != '0' ? 1 : 0;
        }
        else {
            if (A.charAt(i-1) >'0' && A.charAt(i-1) <='9') {
                System.out.println("inside single digit..."+i);
                count += helper(i-1, A, dp);
            }
            System.out.println("substring:"+A.substring(i-2, i));
            int twoDigit = Integer.parseInt(A.substring(i-2, i));
            System.out.println(twoDigit);
            if (twoDigit >= 10 && twoDigit <= 26) {
                System.out.println("inside two digit..."+i);
                count += helper(i-2, A, dp);
            }
        }

        dp[i] = count; // store the result in the dp array
        System.out.println("dp array :"+ Arrays.toString(dp));
        return count;
    }
}

