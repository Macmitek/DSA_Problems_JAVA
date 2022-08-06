package com.array;

import java.util.Scanner;

public class ChritmasTree {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];

        System.out.println("Enter A data: ");
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter B data: ");
        for(int i=0;i<N;i++){
            B[i] = sc.nextInt();
        }


        int result = solve(A,B);
        System.out.println("Result is :"+result);
    }



    public static int solve(int[] A,int[] B) {
        int n = A.length;
        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i <= n -3; i++) {
            int currSum = 0;
            for (int j = i; j < i +3; j++) {
                currSum += B[j];
            }
            if (currSum < minSum) {
                minSum = currSum;
                minIndex = i;
            }
        }

        return minIndex;
    }
}



