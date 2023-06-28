package com.AdvArray;

import java.util.HashSet;

public class CountingSubarray {
    public static void main(String[] args) {
        int[] A = {1,1,3};
        int res = solve(A);
        System.out.println("The ans is:"+res);
    }
    public  static int solve(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        long ans = 0;
        int N = A.length, l = 0;
        for(int r = 0; r < N; r++) {
            // check if A[r] is already there in the present window
            while(hs.contains(A[r])) {
                hs.remove(A[l]);
                l++;
            }
            // add the subarrays ending at position r
            ans = ans +( r - l + 1);
            System.out.println("The ans :"+ans);
            hs.add(A[r]);
            System.out.println("set end :"+hs);
        }
        return (int)(ans % (long)(1e9 + 7));
    }
}

