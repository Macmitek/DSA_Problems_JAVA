package com.AdvMaths;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
        int A = 51299;
        int B = 25646;
        int C  = 3685739;
        int res = solve(A,B,C);
        System.out.println("Ans is: "+res);
    }
    public static int solve(int n, int r,int m)
    {

        long mod = m;
        long nfact = factorial(n,mod);
        long rfact = factorial(r,mod);
        long nminusrfact = factorial(n-r,mod);
        long temp = ((rfact%mod) * (nminusrfact%mod))%mod;
        long rpowmod = pow(temp,mod-2,mod);
        long res = ((nfact%mod)*(rpowmod%mod))%mod;
        return  (int)res;

    }
    public  static long factorial(int B,long mod){
        long fact = 1;
        for(long i = 2; i <= B; i += 1) {
            fact = ((fact%mod) * (i%mod)) % mod;
        }
        return fact%mod;

    }

    public static long pow(long A, long B, long C) {
        if(A==0){return 0;}
        if(B==0){
            return 1;
        }
        long x = pow(A,B/2,C);
        if(B%2==0){
            return (((x%C*x%C)+C)%C);
        }
        else{
            return (((x%C*x%C*A%C)+C)%C);
        }
    }
}
