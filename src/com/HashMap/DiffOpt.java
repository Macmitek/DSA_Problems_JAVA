package com.HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class DiffOpt {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int res = solve(A,B);
        System.out.println("Ans is : " + res);
    }
    public static int solve(int[] A, int B){
        int N = A.length;
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < N; i++) {

            if (hs.contains(A[i]-B) || hs.contains(A[i]+B)){
                return 1;
            }
            else{
                hs.add(A[i]);
            }
            System.out.println(hs);
        }

        return 0;
    }
}
