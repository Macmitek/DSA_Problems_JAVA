package com.Revision;

import java.util.Scanner;

public class PickfromBothsides {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,1};
        int n = 3;
        int res =  solve(arr,n);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A,int k){
        int[]  psum = new int[A.length];
        int[]  sfum =  new int[A.length];
        int N =  A.length;
        psum[0] =  A[0];
        for(int i=1;i<N;i++){
            psum[i] = psum[i-1] + A[i];
        }
        sfum[N-1] = A[N-1];
        for(int i=N-2;i>=0;i--){
            sfum[i] = sfum[i+1] + A[i];
        }

        int max = sfum[N-k];
        for(int i=1;i<k;i++){
            max = Math.max(max,psum[i-1] + sfum[N-k+i]);
        }


        return  max;
    }
}
