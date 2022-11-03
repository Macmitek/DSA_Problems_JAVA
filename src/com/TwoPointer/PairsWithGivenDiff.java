package com.TwoPointer;

import java.util.Arrays;

public class PairsWithGivenDiff {
    public static void main(String[] args) {
        int[] A = {1,5,3,4,2};
        int B = 3;
        int res = solve(A,B);
        System.out.println("Ans is:"+res);
    }
    public static  int solve(int[] arr,int k){
        int n =  arr.length;
        int count = 0;
        Arrays.sort(arr); // Sort array elements

        int l = 0;
        int r = 0;
        while(r < n)
        {
            if(arr[r] - arr[l] == k)
            {
                count++;
                l++;
                r++;
            }
            else if(arr[r] - arr[l] > k)
                l++;
            else // arr[r] - arr[l] < sum
                r++;
        }
        return count;

    }
}
