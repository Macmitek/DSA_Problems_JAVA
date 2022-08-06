package com.Sorting;

import java.util.Scanner;

public class SortByColor {
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
        for(int i=0;i<res.length;i++){
            System.out.println(" "+res[i]);
        }

    }
    public static int[] solve(int[] A){
        int N = A.length;
        int[] arr = new int[N];
        int r=0,w=1,b=2;
        for(int i=0;i<N;i++){
            if(A[i]==0){
                r++;
            }
            if(A[i]==1){
                w++;
            }
            if(A[i]==2) {
                b++;
            }
        }
        for(int i=0;i<N;i++){
            if(i<r){
                arr[i] = 0;
            }
            else if(i>=r && i<N-w){
                arr[i] = 1;
            }
            else {
                arr[i] = 2;
            }
        }
        if(N==1){
            arr[0]=A[0];
        }
        return arr;
    }
}
