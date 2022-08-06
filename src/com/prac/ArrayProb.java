package com.prac;

import java.util.Scanner;

public class ArrayProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean flag;

        for (int i=0;i<T;i++) {
            int A = sc.nextInt();
            int arr[] = new int[A];
            for (int j = 0; j <= A-1; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < A; j++) {
                System.out.println(arr[j]);
            }
            int B = sc.nextInt();
            flag=false;
            for(i=0;i<A;i++){
                if(B==arr[i]){
                    flag=true;
                }
            }
            if(flag)
                System.out.println(1);
            else
                System.out.println(0);
        }




    }
}
