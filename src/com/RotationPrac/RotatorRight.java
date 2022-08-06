package com.RotationPrac;

import java.util.Scanner;

public class RotatorRight {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();

        }
        //No of Rotation
        int B = sc.nextInt();
        int narr[] = new int[N];

        for(int i=0;i<N;i++){
            // for left rotation = = narr[i] = arr[(i+B)%N];
            narr[(i+B)%N] =  arr[i]; // for right rotation
        }
        for(int i=0;i<N;i++){
            System.out.print(narr[i]);
         }
    }
}


 //  1,2,3,4,5 
 //  5,1,2,3,4 for B=1
 //  4,5,1,2,3

// A[N] = {1,2,3,4,5};
 // B[2,3]

 //output = [[4,5,1,2,3],[3,4,5,1,2]]
//  5
//  1 2 3 4 5
//  2
//  2 3




