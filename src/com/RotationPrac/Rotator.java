package com.RotationPrac;

import java.util.Scanner;

public class Rotator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();

        }
        //No of Rotation
        int B = sc.nextInt();
       // int narr[] = new int[N]
        //arr = {1,2,3,4,5}
       int temp = arr[0];
       int imp=0;
        for(int i=0;i<N;i++){
            imp=(imp+B)%N; //2
            temp =temp + arr[imp];
            arr[imp] = temp - arr[imp];
            temp = temp - arr[imp];
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i]);
         }
    }
}


 //  1,2,3,4,5 
 //  5,1,2,3,4 for B=1
 //  4,5,1,2,3