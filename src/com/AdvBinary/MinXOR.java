package com.AdvBinary;

import java.util.ArrayList;
import java.util.Collections;

public class MinXOR {
    public static void main(String[] args) {

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(0);
            arr.add(2);
            arr.add(5);
            arr.add(7);

            System.out.println("Input arraylist :"+arr);
            int ans = solve(arr);
            System.out.println("Ans is :"+ans);
    }
    public static int solve(ArrayList<Integer> A){
        Collections.sort(A);
        int N = A.size();
        int min_xor = Integer.MAX_VALUE;
        for (int i=0;i<N-1;i++){
            min_xor = Math.min(min_xor,A.get(i)^A.get(i+1));
        }
        return min_xor;
    }
}
