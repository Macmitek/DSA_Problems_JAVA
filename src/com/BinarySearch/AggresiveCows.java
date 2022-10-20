package com.BinarySearch;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int B = 3;
        int res = solve(A,B);
        System.out.println("Ans is : "+res);
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int N = A.length;
        int l = 1, r = A[N-1]-A[0];
        int ans = Integer.MIN_VALUE, mid = 0;

        while(l<=r){
            mid = l+(r-l)/2;

            if(accomodate(A,mid,B)){
                ans = Math.max(ans,mid);
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return ans;
    }

    private  static boolean accomodate(int[] arr,int mid,int m){
        int lastPlaced = arr[0];
        //int cowsPlaced = 1;
        m-=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPlaced>=mid){
                lastPlaced = arr[i];
                m-=1;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }

}
