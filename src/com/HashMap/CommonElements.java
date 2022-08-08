package com.HashMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
// if repetition is not allowed in ansd
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size for Array A::");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter elements for array A:");
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the Size for Array A::");
        int M = sc.nextInt();
        int[] B = new int[N];
        System.out.println("Enter elements for array B:");
        for(int i=0;i<M;i++){
            B[i] = sc.nextInt();
        }
        int res[] = solve(A,B);
        for(int i=0;i<res.length;i++){
            System.out.println(" "+res[i]);
        }

    }
    public static int[] solve(int[] A,int[] B){
        HashSet<Integer> set = new HashSet<>();

        int N = A.length;
        int M = B.length;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i]==B[j]){
                    set.add(A[i]);
                }
            }
        }

        int n =set.size();
        int[] ans = new int[n];
        int i=0;
        for(Integer ele:set){
            ans[i++] = ele;
        }
        return ans;
    }
}
