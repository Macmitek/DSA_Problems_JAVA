package com.Strings;

import java.util.Scanner;

public class LongestPalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "miteshjadav";
        System.out.println("Entered string was: "+str);

        String res = solve(str);
        System.out.println("Ans is :"+res);
    }
    public static String solve(String A){
        int n=A.length(),start=0,end=0,max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int l=i-1;
            int r=i+1;
            int count=1;
            while(l>=0 && r<n){
                if(A.charAt(l)==A.charAt(r)){
                    count+=2;

                }else{
                    break;
                }
                l--;
                r++;
            }
            if(count>max){
                start=l+1;
                end=r-1;
                max=count;
            }

        }

        for(int i=0;i<n;i++){
            int l=i, r=i+1,count=0;
            while(l>=0 && r<n){
                if(A.charAt(l)==A.charAt(r)){
                    count+=2;

                }else{
                    break;
                }
                l--;
                r++;
            }
            if(count>max){
                start=l+1;
                end=r-1;
                max=count;
            }else if(count==max){
                if(start<(l+1)){
                    break;
                }else{
                    start=l+1;
                    end=r-1;
                    max=count;
                }
            }

        }

        String str="";
        for(int i=start;i<=end;i++){
            str+=A.charAt(i);
        }
        return str;
    }
}

