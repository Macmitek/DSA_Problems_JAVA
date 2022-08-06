package com.Strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "miteshjadav";
        System.out.println("Entered string was: "+str);

        String res = solve(str);
        System.out.println("Ans is :"+res);
    }
    public static String solve(String res){
        String A =res;
        char[] ch = A.toCharArray();
        int N = res.length();
        System.out.println("Ans: "+res);
        for(int i=0;i<N;i++){
            if(A.charAt(i)=='a'|| A.charAt(i)=='e' ||A.charAt(i)=='i' ||A.charAt(i)=='o' ||A.charAt(i)=='u'){

            }
        }
        return res;
    }
}
