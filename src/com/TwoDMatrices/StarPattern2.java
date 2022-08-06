package com.TwoDMatrices;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B = 2 * A;
        for (int i = 0; i < B / 2; i++) {
            for (int j = 0; j < B; j++) {
                if (j >= (B / 2) - i && j < B / 2 + i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            if (i < B/2-1) {
                System.out.println();
            }
        }
        for (int i = B / 2; i >= 0; i--) {
            for (int j = B - 1; j >= 0; j--) {
                if (j >= (B / 2) - i && j < B / 2 + i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            if (i>0) {
                System.out.println();
            }
        }

    }
}

