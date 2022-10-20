package com.Sorting;

import java.util.Scanner;

public class RotatedSortedArraySearch {
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

            int idx = findPivot(A);
            int N = A.length;
            int l = 0;
            int r = N-1;
            if(B>A[N-1]){
                r = idx-1;
            }else{
                l = idx;
            }

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

        public static int findPivot(int[] A){
            if(A == null || A.length == 0){
                return -1;
            }
            if(A.length == 1 || A[0] < A[A.length-1]){
                return 0;
            }
            int N = A.length;
            int start = 0; int end = N -1;
            while (start <= end) {

                int mid = (start + end) / 2;
                if (mid < N-1 && A[mid] > A[mid+1]) {
                    return (mid + 1);
                } else if (A[start] <= A[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return 0;
        }
}