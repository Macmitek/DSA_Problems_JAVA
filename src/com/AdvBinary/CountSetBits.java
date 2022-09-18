package com.AdvBinary;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = solve(N);
        System.out.println("ans is :"+res);
    }
//    public  static int countSetBits(int n)
//    {
//        int ans=0;
//        while(n>0)
//        {
//            if((n&1 )== 1) ans++;
//            n=n>>1;
//        }
//        return ans;
//    }
//    public  static int solve1(int n)
//    {
//        int ans=0;
//        while(n>0)
//        {
//            n = n & (n-1);
//            ans++;
//        }
//        return ans;
//    }
//
//    public static int solve(int A) {
//        int ans=0;
//        for(int i=1;i<=A;i++)
//        {
//            //ans+=countSetBits(i);
//            ans+=solve1(i);
//        }
//        ans=(ans)%1000000007;
//        return ans;
//    }
    public  static  int solve(int n){
        long n1 = n;

        if(n==0){
            return 0;
        }
        long x = largePower2(n1);
        long btill2x = (x * (1<<(x-1)));
        long msb2 = (n - (1<<x) +1);
        long other = (n1 - (1<<x));
        long ans = (btill2x + msb2+solve((int)other))%1000000007;
        return (int)ans;
    }
    public  static  int largePower2(long n){
        int x = 0;
        while((1<<x)<=n){
            x++;
        }
        return x-1;
    }

}
