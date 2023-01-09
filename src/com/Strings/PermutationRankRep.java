package com.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationRankRep {
    static long MOD = 1000003;
    static long[] factorial= new long[100001];

    public static void main(String[] args) {
        String A = "acb";
        int res = solve(A);
        System.out.println("Ans is :"+res);
    }
    public static  int solve(String A){
        char[] c = A.toCharArray();
        Arrays.sort(c);
        String str1 = new String(c);
        String temp = str1;
        int n =  A.length();
        long sum = 0l;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(A.charAt(i))){
               map.put(A.charAt(i),map.get(A.charAt(i))+1);
            }else{
                map.put(A.charAt(i),1);
            }
        }
        System.out.println(map);
        for(int i = 0; i < n-1; i++){
            long index = getIndex(A.charAt(i),map);

            sum += (index*(solve((long)(n-1-i), MOD, map)))%MOD;

            temp = temp.replaceFirst(A.charAt(i)+"", "");
            sum%=MOD;
            if(map.containsKey(A.charAt(i))){
                if(map.get(A.charAt(i))>1)
                    map.put(A.charAt(i), map.get(A.charAt(i))-1);
                else
                    map.remove(A.charAt(i));
            }
        }
        return (int)sum+1;

    }


    //power function
    public  static long power(long a,long b, long mod){
        if(b==0) return  1;
        long half = power(a,b/2,mod);
        long ans = (half*half)%mod;
        if(b%2==1){
            return  (a*ans)%mod;
        }
        return  ans;
    }
    public static int solve(long N, long MOD, Map<Character, Integer> map) {


        long EX = MOD-2;
        long num1 =fact(N, MOD);
        long res = num1%MOD;

        for (Character c : map.keySet()) {
            int count = map.get(c);
            if(count >1) {
                long R = (long)(count);
                long num2 = fact(R, MOD);
                num2 = power(num2, EX,MOD);

                res = (res*num2)%MOD;
            }
        }
        return (int)res;

    }
    public static long getIndex(char c, Map<Character, Integer> map){
        long cnt = 0;
        for (Character ch : map.keySet()) {
            int compareOneTwo = Character.compare(c, ch);
            if(compareOneTwo > 0)
                cnt+=map.get(ch);
        }
        return cnt;
    }
    public static long fact(long n, long M){

        long result = 1l;
        for (long i = 1l; i <= n; i++)
            result = (result * i) % M;

        return result;
    }
}
