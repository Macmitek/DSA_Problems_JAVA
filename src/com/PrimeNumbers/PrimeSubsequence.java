package com.PrimeNumbers;

public class PrimeSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,3,6,7,5,11};
        int res  = solve(arr);
        System.out.println("Ans is:"+res);
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i*i <= n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public  static int solve(int[] A) {
        int count = 0;
        int ans = 0;
        int mod = 1000000007;
        int N = A.length;
        for(int i=0; i<N;i++){
            if(isPrime(A[i])){
                ans = (int) ((ans%mod+ Math.pow(2, count)%mod)%mod);
                count++;
            }
        }
        return ans;
    }
}
