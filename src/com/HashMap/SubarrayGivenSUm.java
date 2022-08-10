package com.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayGivenSUm {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter B");
        int B = sc.nextInt();
        int res[] = solve(A,B);
        for (int i=0;i<res.length;i++){
           System.out.print(" "+res[i]);
       }

    }
    public  static int[] solve(int[] A, int B) {
         int N = A.length;
         long currentSum=0;
         for(int i=0; i<N;i++){
             if (A[i] == B){
                 return new int[] {A[i]};
             }
             currentSum = A[i];
             for(int j=i+1; j<N; j++){
                 currentSum+= A[j];
                 if(currentSum==B){
                     int [] result = new int[j-i+1];
                     for(int k=i; k<=j;k++){
                         result[k-i] = A[k];
                     }
                     return result;
                 }
             }

         }
         return new int[]{-1};
     }

}
