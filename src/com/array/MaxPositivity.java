package com.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxPositivity {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }


        ArrayList<Integer> res = solve(A);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(" " + res.get(i));
        }
    }



    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        int max= 0;
        int maxindex = 0;

        for (int i = 0; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <=n; j++) {
                sum += A.get(j);
            }
            if (sum > max) {
                max = sum;
                maxindex = i;
            }
        }

        return A;
    }
}




