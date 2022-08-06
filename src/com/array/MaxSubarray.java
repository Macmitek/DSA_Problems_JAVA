package com.array;

import java.util.Scanner;

public class MaxSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter Limit: ");
        int B = sc.nextInt();
        int res = solve(B,N,A);
        System.out.println("The Max amount possible is: "+res);


    }
    public static int solve(int A, int B, int[] C) {

        int max =0;
        for(int i=0;i<=A;i++)
        {
            int sum=0;
            for(int j=i;j<=A;j++)
            {
                sum = sum+C[j];
                if(sum>max && sum<=B)
                    max = sum;
                if(sum>B)
                    break;
            }
        }
        return max;
    }
}
