package com.HashMap;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size for Array A::");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter elements for array A:");
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        System.out.println("Enter the Size for Array A::");
        int M = sc.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        System.out.println("Enter elements for array B:");
        for (int i = 0; i < M; i++) {
            B.add(sc.nextInt());
        }
        ArrayList<Integer> res = solve(A, B);
        System.out.println("Ans is :" + res);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        return ans;
    }
}
