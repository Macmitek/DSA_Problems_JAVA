package com.ModularArithmetic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println("Ans is:"+res);
    }
    public  static int solve(int A){

        if(A%400==0){
            return 1;
        }
        else if(A%4==0 && A%100!=0){
            return 1;
        }
        return 0;
    }
}
