package com.prac;

import java.util.ArrayList;

public class graycode {
    public static void main(String[] args) {
        int A = 3;
        System.out.println("1 << A :: " + (1 << A));
        int n = 1 << A;
        ArrayList< Integer > result = new ArrayList < > ();
        // G[n] = n ^ (n >> 1)
        for (int i = 0; i < n; i++) {
            System.out.println("i ^ (i >> 1)  : :  "+(i ^ (i >> 1)));
            result.add(i ^ (i >> 1));
        }
        System.out.println("the res is :"+result);
    }
}
