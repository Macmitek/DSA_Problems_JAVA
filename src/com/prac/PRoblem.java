package com.prac;

import java.util.Scanner;

public class PRoblem {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        int A[] = new int[n];
        for (int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        int sum = 0;
        for(int j =0 ; j<= A.length ;j++){
            for (int i = 1 ; i<=A[j] ; i++){
                if(A[j]%i==0){
                    sum = sum +i;
                }
            }
            if(sum == A[j]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}