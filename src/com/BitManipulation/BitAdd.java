package com.BitManipulation;

import java.util.Scanner;

public class BitAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String res = solve(str1,str2);
        System.out.println("ANs is : "+res);

    }
    public static  String solve(String A,String B){
        String result = "";
        int b1 = Integer.parseInt(A,2);
        int b2 = Integer.parseInt(B,2);
        int sum = b1+b2;
        return Integer.toBinaryString(sum);
    }
}
