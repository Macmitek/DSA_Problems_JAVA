package com.HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class SubarrayZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int res = solve(A);
        System.out.println("Result is:"+res);
    }
    public  static int solve(int[] A) {
        HashSet<Long> hset = new HashSet<Long>();
        Long psum = 0l;
        int N = A.length;
        for(int i=0;i<N;i++){
            psum = psum + A[i];
            if(hset.contains(psum)){
                return 1;
            }
            if(psum==0 || A[i]==0){
                return 1;
            }
            hset.add(psum);
        }
        return 0;

    }
}
