package com.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = solve(N);
        System.out.println("Ans is: "+res);
    }
    public static int solve(int A){
        if(A==0){
         return 0;
        }else{
            return (A%10 + solve(A/10));
        }

    }
}
