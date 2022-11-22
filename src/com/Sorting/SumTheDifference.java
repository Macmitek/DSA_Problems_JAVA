package com.Sorting;

import java.util.Arrays;

public class SumTheDifference {
    public static void main(String[] args) {
        int[] A = {3,4,5,6,7};
        int res =  solve(A);
        System.out.println("ANs is :"+res);
    }
    public  static  int solve(int[] A){
        int n = A.length;
        int mod =  1000000007;
        Arrays.sort(A);
        int min =0, max = 0;
        for(int i = 0; i<n;i++){
            min = (2*min + A[i])%mod;
            max = (2*max + A[n-1-i])%mod;
        }
        return  (max- min + mod)%mod;
    }

}
