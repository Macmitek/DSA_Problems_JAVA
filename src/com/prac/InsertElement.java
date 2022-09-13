package com.prac;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans[] = new int[N+1];
        for (int i=0;i<N+1;i++){
            if(i<Y-1){
                ans[i] = A[i];
            }
            else if(i==Y-1){
                ans[i] = X;
            }
            else {
                ans[i] = A[i-1];
            }
        }



        for (int j=0;j<ans.length;j++){
            System.out.print(" "+ans[j]);
        }
    }


}
