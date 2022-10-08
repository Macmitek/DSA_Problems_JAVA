package com.Sorting;

import java.util.Arrays;

public class ConsecutiveorNot {
    public static void main(String[] args) {
        int[] A = {3,2,1,4,5};
        int res = solve(A);
        System.out.println("Ans is:"+res);

    }
    public  static int solve(int[] A){
        int n = A.length;
        int ans = 0;
        Arrays.sort(A);

        for(int i=1;i<n;i++){
            if(A[i-1] != A[i]-1){
                return 0;
            }
        }
        return 1;
    }
}
