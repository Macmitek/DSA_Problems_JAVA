package com.Sorting;

import java.util.Scanner;

public class QuickSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int res[] = solve(A);
        for (int i : res){
            System.out.print(" "+i);
        }
    }
    public  static  int[] solve(int[] A){
        sort(A,0,A.length-1);

        return A;
    }
    public  static  void sort(int[] A, int l, int r){
        if(l>=r) return;
        int idx = rearrange(A,l,r);
        sort(A,l,idx-1);
        sort(A,idx+1,r);
    }
    public static int rearrange(int[] A, int l, int r){

        int left = l+1;
        int right =  r;
        while (left<=right){
            if(A[left] <= A[l]) {
               left++;
            }
            else if(A[right] > A[l]) {
                right--;
            }
            else {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++; right--;

            }
        }
        int temp = A[l];
        A[l] = A[right];
        A[right] = temp;


        return right;
    }
}