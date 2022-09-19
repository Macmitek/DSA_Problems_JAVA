package com.ModularArithmetic;

public class VeryLargePower {
    public static void main(String[] args) {
        int res = solve(2,27);
        System.out.println("Ans is:"+res);
    }
    public  static int solve(int A, int B) {

        long mod = (long)(1e9+7);
        long power = factorial(B,mod-1);
        long res = pow(A,power,mod);
        return (int)res;
    }
    public static long factorial(int B,long mod){
        if (B == 0)
            return 1;
        else
            return (B%mod * factorial(B-1,mod)%mod) % mod;
    }

    public static long pow(long A, long B, long C) {
        if(A==0){return 0;}
        if(B==0){
            return 1;
        }
        long x = pow(A,B/2,C);
        if(B%2==0){
            return ((x%C*x%C)+C)%C;
        }
        else{
            return ((x%C*x%C*A%C)+C)%C;
        }
    }
}