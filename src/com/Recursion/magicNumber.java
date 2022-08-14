package com.Recursion;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = solve(N);
        System.out.println("Ans is: "+res);
    }
    public static int solve(int A){
        if(A == 1){
            return 1;
        }else if(A/10 == 0 && A!=1){
            return 0;
        }
        int sum = 0;
        while (A>0){
            sum = sum + A%10;
            A/=10;
        }
        return solve(sum);

    }
}
