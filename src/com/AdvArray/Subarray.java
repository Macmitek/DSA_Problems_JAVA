package com.AdvArray;

public class Subarray {

    public static void main(String[] args) {
        int[] arr = new int[]{8,8,3,6,11,13,15};
        int res  = solve(arr);
        System.out.println("Ans is:"+res);
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public  static int solve(int[] A) {
        int count = 0;
        int n = A.length;
        for (int i=0; i <n; i++){
            for (int j=i; j<n; j++) {
                System.out.println();
                for (int k=i; k<=j; k++){
                    if(isPrime(A[k])){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
