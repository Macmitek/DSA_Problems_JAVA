package com.array;

import java.util.Scanner;

public class EvenSUbarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        String res = solve(A);
        System.out.println("The ans  is: " + res);


    }

    public static String solve(int[] A) {

        int N = A.length;

        if (N % 2 == 0 && A[0] % 2 == 0 && A[N - 1] % 2 == 0) {
            return "YES";
        } else {
            return "NO";

        }
    }
}