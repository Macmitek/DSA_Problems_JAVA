package com.StringArr;

import java.util.Scanner;

public class AmzSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "miteshjadav";
        System.out.println("Entered string was: "+str);

        int res = solve(str);
        System.out.println("Ans is :"+res);

    }
    public static  int solve (String A){
        int N = A.length();
        int count =0;

        for(int k=0;k<N;k++){
            if(A.charAt(k)=='A'||A.charAt(k)=='a'|| A.charAt(k)=='E' || A.charAt(k)=='e' ||
                    A.charAt(k)=='I' ||A.charAt(k)=='i' ||A.charAt(k)=='O' ||A.charAt(k)=='o' ||
                    A.charAt(k)=='U' ||A.charAt(k)=='u')

                count=count+(N-k);
        }



        int Modulo = count%10003;

        return Modulo;
    }
}
