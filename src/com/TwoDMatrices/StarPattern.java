package com.TwoDMatrices;

import java.lang.*;

import java.util.*;


public class StarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        int flag=0;
        for (int i = n; i >= 1; i--) {
            if(flag==1){
                System.out.println();
            }
            flag =1;
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = j; k < 2 * n - j; k++) {
                System.out.print(" ");
            }

            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = j; k <= 2 * n - j + 1; k++) {
                System.out.print(" ");
            }
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
        }
    }
} 

 