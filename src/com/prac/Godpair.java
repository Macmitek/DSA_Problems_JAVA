package com.prac;


import java.util.Scanner;

public class Godpair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int result = solve(arr,B);
        System.out.println(result);

    }
    public static int solve(int[] A,int B ){
        int N = A.length;
        for (int i=0;i<N;i++) {
            for(int j = i+1;j<N;j++){
                if(i==j){
                    continue;
                }
                else if(A[i] + A[j] == B){
                    return 1;
                }
            }

        }
        return 0;
    }
}






