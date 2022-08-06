package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMod {
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
        System.out.println("Result is: "+res);
    }
    public static int solve(int[] A){
        int n = A.length;
        Arrays.sort(A);
        for (int i=0;i<n;i++) {
            System.out.println("A:"+A[i]);
        }
        int max=A[n-1];

        for(int i=n-2;i>=0;i--){

            if(A[i] == max)
                continue;

            return A[i] % max;
        }
        return 0;
    }
}
