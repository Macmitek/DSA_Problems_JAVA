package com.prac;

import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

public class Shaggu {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Size: ");
//        int N = sc.nextInt();
//        int A[] = new int[N];
//        System.out.println("Enter Array Elements: ");
//
//        for (int i=0;i<N;i++) {
//            A[i] = sc.nextInt();
//        }
        int[] A = new int[]{7,1,3,4,1,7};
        int res = solve(A);
        System.out.println("Result is:"+res);
    }
    public  static  int solve(int[] A) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int N = A.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (set.containsKey(A[i])) {
                int prev = set.get(A[i]);
                int diff = Math.abs((i - prev));
                ans = Math.min(ans, diff);
            } else {
                set.put(A[i], i);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;

        } else {
            return ans;
        }
    }
}
