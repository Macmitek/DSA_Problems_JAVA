package com.Recursion;

import java.util.Scanner;

public class PowerMod {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int n = sc.nextInt();
        int C = sc.nextInt();
        int res = solve(A,n,C);
        System.out.println("Ans is: "+res);
    }
    public static int solve(int A,int B,int C){
        if(A==0){
           return 0;
        }
        if(B==0){
            return 1;
        }
        int half = solve(A,B/2,C);
        if(B%2==0){
            return (half*half)%C;
        }
        else {
            return (((half*half)%C)*(A%C))%C;
        }

    }
}
