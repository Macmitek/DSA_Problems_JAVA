package com.Array;

import java.util.Scanner;

public class MaxSubopt {

    public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array size: ");
            int N = sc.nextInt();
            int A[] = new int[N];
            System.out.println("Enter Array Elements:");
            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
            }

            int result = solve(A);
            System.out.println("Result is :"+result);
    }



    public static int solve(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
    
}

