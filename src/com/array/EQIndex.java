package com.array;

import java.util.Scanner;

public class EQIndex {

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
        System.out.println("The time is: "+res);


    }

    public static int solve(int[]  A){
        if(A.length == 0)
            return 0;
        int sum = A[0];
        int smallest = A[0];
        for(int i=1;i<A.length;i++) {

            if (A[i] > smallest) {
                smallest = A[i];
            }
            sum += A[i];
        }
        return (A.length * smallest) - sum;
    }
}
