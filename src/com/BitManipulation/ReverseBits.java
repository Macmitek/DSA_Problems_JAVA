package com.BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseBits {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long res = solve(n);
        System.out.println("Res is  : "+res);


    }
    public static long solve(long A){

        double num = 0;
        double power = Math.pow(2,31);

        while (A!=0) {

            num = num + (A%2)*power;
            power /= 2;
            A/=2;
        }

        return (long)num;
    }

}
