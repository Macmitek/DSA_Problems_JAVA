package com.ModularArithmetic;

import java.util.Scanner;

public class RepeatandMiss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        int res[] = solve(A);
        for (int i=0;i< res.length;i++) {
            System.out.println(res[i]);
        }


    }

    public static int[] solve(int[]  A){
        int[] arr = new int[2];
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans = ans|A[i];
        }
        arr[0] = ans;
        return arr;
    }
}
