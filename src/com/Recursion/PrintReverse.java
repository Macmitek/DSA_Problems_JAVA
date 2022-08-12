package com.Recursion;

import java.util.Scanner;

public class PrintReverse {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N =sc.next();
        solve(N,N.length()-1);

    }
    public  static  void solve(String A,int len){

        if(len<0){return;}
        System.out.println(A.charAt(len));
        solve(A,len-1);

    }
}
