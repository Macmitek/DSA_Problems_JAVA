package com.AdvMaths;

import java.util.ArrayList;

public class PUBG {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(2); list.add(3); list.add(4);
        int[] arr = new int[]{2,3,4};
        int res = solve1(arr);
        int res1 = solve(list);
        int res2  = solve2(arr);
        System.out.println("Ans is:"+res2);
    }
    public  static int solve1(int[] A){
        int N = A.length;
        int i;
        for(i=0; i<N-1; i++){
            A[i+1] = gcd(A[i],A[i+1]);
        }
        return A[i];
    }
    public  static int solve2(int[] A){
        int ans = 0;
        for (int i = 0; i < A.length; i++)
            ans = gcd(ans, A[i]);

        return  ans;
    }


    public  static int solve(ArrayList<Integer> A){
        if(A.size()==0){
            return 0;
        }

        int num = 0;
        for(int i=0;i<A.size()-1;i++){
            num = gcd(A.get(i),num)  ;
            if(num ==1){
                return 1;
            }
        }
        return num;
    }

    public  static  int gcd(int A,int B){
        if(A==0){
            return B;
        }
        return gcd(B%A,A);
    }
}
