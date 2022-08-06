package com.prac;

import java.util.Scanner;

public class Arramax {
    public static void main(String[] args) {
        int A[] = {1,2,44,3};
        int B[] = A.clone();

        for(int i =0 ;i<A.length-1 ;i ++){
            for(int j = 0 ; j <= B.length-1 ; j++){
                System.out.println("A and B :"+A[i]+"and "+B[j]);
                int mod = A[i] % B[j];
            }
        }

    }
}
