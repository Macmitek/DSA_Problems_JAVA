package com.Sorting;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int res = solve(A);
        System.out.println("Ans is: "+res);
    }
    public  static  int solve(int[] A){
        return 0;
    }
}
