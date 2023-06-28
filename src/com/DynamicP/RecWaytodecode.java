package com.DynamicP;

import java.util.Arrays;

public class RecWaytodecode {
    public static void main(String[] args) {
        String A = "1213";
        int res = solve(A);
        System.out.println("the ans is :"+res);
    }

    public static int solve(String A){
        int n = A.length();
        return helper(0,A);
    }

    public static int helper(int i, String A){
        int count = 0;
        if (i == 0) {
            count = 1;
        }
        else if (i == 1) {
            count = A.charAt(0) != '0' ? 1 : 0;
        }
        else {
            if (A.charAt(i-1) >'0' && A.charAt(i-1) <='9') {
                count += helper(i-1, A);
            }
            int twoDigit = Integer.parseInt(A.substring(i-2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                count += helper(i-2, A);
            }
        }
        return count;
    }
}

