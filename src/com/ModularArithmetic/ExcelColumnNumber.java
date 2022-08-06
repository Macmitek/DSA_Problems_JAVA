package com.ModularArithmetic;

import java.util.Scanner;

public class ExcelColumnNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            int n1=x;
            int n2=y;
            while(x%y!=0){
                int rem = x%y;
                x=y;
                y=rem;
            }
            int gcd = y;
            int lcm = (n1*n2)/gcd;
        System.out.println(lcm);
    }
}
//    int x = sc.nextInt();
//    int y = sc.nextInt();
//
//    int n1=x;
//    int n2=y;
//            while(x%y!=0){
//                    int rem = x%y;
//                    x=y;
//                    y=rem;
//                    }
//                    int gcd = y;
//                    int lcm = (n1*n2)/gcd;
//                    System.out.println(lcm);