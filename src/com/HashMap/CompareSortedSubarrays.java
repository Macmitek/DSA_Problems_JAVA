package com.HashMap;

import java.util.HashSet;

public class CompareSortedSubarrays {
    public static void main(String[] args) {
        int[] A = {1,7,11,8,11,7,1};
        int[][] B = {{0,2,4,6}};
        int[] res =  solve(A,B);
        for(int i : res){
            System.out.print(" "+i);
        }
    }
    public  static  int[] solve(int[] A,int[][] B){
        int[] ans =  new int[B.length];
        HashSet<Integer> set = new HashSet<>();
        int N = A.length;
        int Q = B.length;
        for(int i=0;i<Q;i++){
            int l1 = B[i][0];
            int r1 = B[i][1];
            int l2 = B[i][2];
            int r2 = B[i][3];
            for(int j=0;j<N;i++){

            }
        }
        return  ans;
    }
}
