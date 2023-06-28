package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EquilibriumIDX {
    public static void main(String[] args) {
        int[] A = {-7,1,5,2,-4,3,0};
        int ans = solve(A);
        System.out.println("The ans is:"+ans);
    }
    public static int solve(int[] A) {
        int N = A.length;

        int PS[] = new int[N];
        PS[0] = A[0];

        for(int i=1;i<N;i++){
            PS[i] = PS[i-1] + A[i];
        }
        System.out.println("PS array:"+ Arrays.toString(PS));
        return 0;
    }
}
