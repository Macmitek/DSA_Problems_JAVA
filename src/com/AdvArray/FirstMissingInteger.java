package com.AdvArray;

import java.util.Scanner;

public class FirstMissingInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        int res = firstMissingPositive(a);
        System.out.println("Ans is:"+res);
    }
    public  static int firstMissingPositive(int[] A) {
        int n = A.length;

        for(int i=0; i<n; i++){
            if(A[i] < 0 || A[i]>n){
                A[i] = (n+2);
            }
        }
        System.out.println("//////////////////////////////");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

        for(int i=0; i<n; i++){
            int val = Math.abs(A[i]);
            if(val >= 1 && val <= n){
                A[val-1] = -1 * Math.abs(A[val-1]);
            }
        }
        System.out.println("//////////////////////////////");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

        for(int i=0; i<n; i++){
            if(A[i] > 0){
                return (i+1);
            }
        }
        return (n+1);
    }
}

