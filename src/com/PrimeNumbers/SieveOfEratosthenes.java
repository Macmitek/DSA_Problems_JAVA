package com.PrimeNumbers;

import java.util.ArrayList;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 12;
        int[] res = solve(n);
        System.out.println("a:"+res[0]+" b:"+res[1]);

    }
    public  static int[] solve(int n){

        int[] ans = new int[2];
        if(n==4) {
            ans[0] = 2;
            ans[1] = 2;
            return ans;
        }

        boolean isPrime[] = new boolean[n+1];
        findPrime(n,isPrime);

        for (int i = 0; i < n; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                ans[0] = Math.min(i,n-i);
                ans[1] = Math.max(i,n-i);
                break;
            }
        }
        return ans;
    }



    public static boolean findPrime(int n,boolean[] isPrime){

        // inititalizing true in boolean array

        isPrime[0] = isPrime[1] = false;
        for(int i=2;i<=n;i++){
            isPrime[i] =  true;
        }

        //sieve
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return false;
    }
}
