package com.Sorting;

import java.util.Arrays;
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
        Arrays.sort(A);
        int N = A.length;
        int cnt = 0;
        for(int i=1;i<N;i++){
            if(A[i]<=A[i-1]) {
                cnt+=A[i-1]-A[i]+1;
                A[i]+=A[i-1]-A[i]+1;
            }
        }
        return cnt;
    }
}
