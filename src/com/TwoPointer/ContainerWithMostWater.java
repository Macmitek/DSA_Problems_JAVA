package com.TwoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] A = {1, 5, 4,3};

        int res = solve(A);
        System.out.println("Ans is:" + res);
    }

    public static int solve(int[] A) {
        int N = A.length;
        int l=0;
        int r =  N-1;
        long ans =  0;
        while(l<r){
            ans = Math.max(ans,(r-l)*Math.min(A[l],A[r]));
            if(A[l]>=A[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return (int)ans;
    }
}
