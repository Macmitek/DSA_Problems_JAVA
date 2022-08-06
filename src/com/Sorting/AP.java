package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class AP {
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
        System.out.println("Result is:"+res);

    }
    public static int solve(int[] A){
        int N = A.length;
        Arrays.sort(A);
        int flag = 1;
        int diff = Math.abs(A[1]-A[0]);
        for(int i=1;i<N;i++){
            if(Math.abs(A[i]-A[i-1])!=diff){
                flag=0;
            }
        }
        if(flag==0){
            return 0;
        }
        else
            return 1;
    }
}
