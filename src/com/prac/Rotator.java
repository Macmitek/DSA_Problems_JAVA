package com.prac;

import java.util.Arrays;
import java.util.Scanner;

public class Rotator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         int arr[] = new int[N];

        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int B[] = arr.clone();
        int n = arr.length;
        int l=0;
        int r=n-1;
        int temp;
        while(l<r){
            temp = B[l];
            B[l] = B[r];
            B[r] = temp;

            l++;
            r--;

        }
        for (int i=0;i<N;i++) {
            System.out.println(B[i]);
        }

    }
}

