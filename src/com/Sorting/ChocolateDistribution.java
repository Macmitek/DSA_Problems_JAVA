package com.Sorting;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] A = {3,4,1,9,56,7,9,12};
        int B = 5;
        int res = solve(A,B);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A,int B){

        Arrays.sort(A);
        int ans = Integer.MAX_VALUE;
        int N = A.length;
        for(int i =0 ; i< N-B+1;i++){
            int diff = Math.abs(A[B+i-1]-A[i]);
            ans = Math.min(diff,ans);
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}
