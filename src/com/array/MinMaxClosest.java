package com.array;

import java.util.Scanner;

public class MinMaxClosest {


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
        System.out.println("The MINMAX closest is: "+res);


    }

    public static int solve(int[]  A){

        int min = A[0];
        int max = A[0];
        int N = A.length;
        if (A.length==1){
            return 1;
        }
        for (int i = 1; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        int ans1 = N;
        int ans2 = N;
        for(int i=0; i<N;i++) {
            if(A[i]==max) {
                int min_index = -1;
                for (int j = i; j < N; j++) {
                    if (A[j] == min) {
                        min_index = j;
                        break;
                    }
                }
                if (min_index != -1) {
                    ans1 = Math.min(ans1, min_index - i + 1);
                }
            }
        }
        for(int i=0; i<N;i++) {
            if(A[i]==min){
                int max_index = -1;
                for(int j = i;j<N;j++){
                    if(A[j]==max){
                        max_index =j;
                        break;
                    }
                }
                if (max_index != -1) {
                    ans2 = Math.min(ans2, max_index - i + 1);
                }
            }
        }
        int finalans = Math.min(ans1,ans2);
        return finalans;
    }
}
