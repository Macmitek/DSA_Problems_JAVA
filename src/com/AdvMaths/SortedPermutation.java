package com.AdvMaths;

public class SortedPermutation {
    public static void main(String[] args) {
        String A = "GWAFIBCX";
        int res =  solve(A);
        System.out.println("Ans is:"+res);
    }
    static long fact(int n){
        if(n==0){
            return 1;
        }
        int mod=1000*1003;
        return (n*fact(n-1))%mod;
    }
    public  static int solve(String A) {

        int n=A.length();
        long count=0;
        long ans=0;
        int mod=1000*1003;

        for(int i=0;i<n;i++){
            count =0;
            for(int j=i+1;j<n;j++){
                if(A.charAt(j)<A.charAt(i)){
                    count++;
                }
            }
            ans+=(count*fact(n-i-1))%mod;
        }
        return (int)(ans+1)%mod;
    }
}
