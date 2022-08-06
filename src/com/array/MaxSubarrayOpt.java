package com.array;

import java.util.Scanner;

public class MaxSubarrayOpt {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        int res = solve(A);
        System.out.println("The Max amount possible is: "+res);


    }
    public static int solve(int[] A) {

        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i = 0; i <n ;i++){
            sum = sum+A[i];
            max = Math.max(sum,max);

            if(sum<0){
                sum = 0;
            }
        }
        return max;

    }
}
