package com.prac;

import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=N-2;i>=0;i--) {

            //System.out.println(arr[i]);
            if(arr[i]!=arr[N-1]){
                System.out.println("Second Largest: "+arr[i]);
            }
        }

    }
}
