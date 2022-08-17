package com.HashMap;

import java.util.Scanner;

public class DIffK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int res = solve(A,B);
        System.out.println("Ans is : " + res);
    }
    public static int solve(int[] A, int B){
        int N = A.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(((A[i] - A[j])==B)&& (i!=j)){
                    return 1;
                }
            }
        }
        return  0;
    }
}
