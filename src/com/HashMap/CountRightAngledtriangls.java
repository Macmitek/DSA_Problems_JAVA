package com.HashMap;

import java.util.HashMap;

public class CountRightAngledtriangls {
    public static void main(String[] args) {
        int[] A = {1,1,2,3,3};
        int[] B =  {1,2,1,2,1};
        int res =  solve(A,B);
        System.out.println("Ans is:"+res);
    }
    public  static int solve(int[] A,int[] B){
        int N = A.length;
        HashMap<Integer,Integer> x = new HashMap<>();
        HashMap<Integer,Integer> y = new HashMap<>();
        for(int i=0;i<N;i++){
            x.put(A[i], x.getOrDefault(A[i], 0)+1);
            y.put(B[i], y.getOrDefault(B[i], 0)+1);
        }
        long mod = 1000000007;
        int ans = 0;
        for(int i=0;i<N;i++){
           int  x1 = A[i],y1 = B[i];
           int cnt1 = x.get(x1) -1;
           int cnt2 =  y.get(y1) -1;
           ans = (int)(((ans%mod) + (cnt1 * cnt2)%mod)%mod);

        }
        return  ans;
    }
}
