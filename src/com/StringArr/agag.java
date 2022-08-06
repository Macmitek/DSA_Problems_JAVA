package com.StringArr;

import java.util.Scanner;

public class agag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "miteshjadav";
        //System.out.println("Entered string was: "+str);
//        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }
        int res = solve(str);
        System.out.println("Ans is :"+res);

    }
    public static  int solve (String A){
        int N = A.length();
        long count_g = 0;

        for(int i=0;i<N;i++){
            if (A.charAt(i)=='G'){
                count_g++;
            }
        }
        long ans =0;
        for(int i=0;i<N;i++){
            if (A.charAt(i)=='A'){
               ans = ans + count_g;
            }
            if(A.charAt(i)=='G'){
                count_g --;
            }
        }
        int Modulo = (int)(ans%1000000007);

        return Modulo;
    }
}
