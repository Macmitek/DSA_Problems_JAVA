package com.prac;

import java.util.Scanner;

public class RotateK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }

        int B =  sc.nextInt();
        int narr[] =  new int[N];
        for(int j = 0;j<N;j++){
           narr[j] =  arr[((j+B))%N];
        }
        for (int k=0;k<N;k++) {
            System.out.println(narr[k]);
        }

    }
}





