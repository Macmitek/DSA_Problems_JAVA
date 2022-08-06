package com.array;

import java.util.Scanner;

public class MaxSubarray2 {

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
        for(int start = 0; start <n ;start++){
            int sum = 0;
            for(int end = start ; end < n ;end++){
                sum = sum + A[end];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;

    }
}
