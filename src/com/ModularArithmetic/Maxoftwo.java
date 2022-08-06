package com.ModularArithmetic;

import java.util.Scanner;

public class Maxoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 0;
        int max = 0;
        if(a%b==a){
            min = a;
        }else {
            min = b;
        }
        System.out.println("Min is:"+min);
    }
}
