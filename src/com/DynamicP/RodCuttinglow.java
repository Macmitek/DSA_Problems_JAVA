package com.DynamicP;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RodCuttinglow {

    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2,5));
        int A = 6;
        System.out.println("The minimum cost incurred: " + solve(A,B));
    }
    public static int solve(int A, ArrayList<Integer> B) {
        int n =  B.size();
        B.add(n,A);
        B.add(0,0);
        //Collections.sort(B);
        return helper(1,n,B);
    }

    public static int helper(int i, int j, ArrayList<Integer> cuts) {

        // base case
        if(i > j)
            return 0;

        int miniCost = Integer.MAX_VALUE;

        for(int ind=i; ind<=j; ind++) {
            int ans = cuts.get(j+1) - cuts.get(i-1) + helper(i,ind-1,cuts) + helper(ind+1,j,cuts);
            miniCost = Math.min(miniCost, ans);
        }

        return miniCost;
    }
}
