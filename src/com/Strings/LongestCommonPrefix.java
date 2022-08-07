package com.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of words in Array:");
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.next();
        }
        String res = solve(arr);
        System.out.println("LCP is :"+res);
    }
    public static String solve(String[] A){
        int n = A.length;
        Arrays.sort(A);
        int min = Math.min(A[0].length(),A[n-1].length());
        int last = 0;
        for(int i=0;i<min;i++){
            if(A[0].charAt(i) == A[n-1].charAt(i)){
                last++;
            }
        }
        String ans = A[0].substring(0,last);
        return ans;
    }
}
