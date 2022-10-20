package com.Sorting;

import java.util.Scanner;

public class SortedInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int res = solve(A,B);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A,int B){
        int N  = A.length;
        int l =0;
        int r = N-1;

        while(r>=l){
            int mid = (l+r)/2;

            if(A[mid]==B){
                return mid;
            }
            else if(A[mid]<B){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return  r+1;
    }
}
