package com.Sorting;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int[] A = {2,5,7,9};
        int[] B ={3,5,10};
        int[] res = solve(A,B);
        for(int i:res){
            System.out.print(" "+i);
        }

    }
    public  static int[] solve(int[] A,int[] B){
        int n = A.length;
        int m = B.length;
        int[] C = new int[n+m];

        int p1 = 0,p2=0,p3=0;
        while(p1<n && p2<m){
            if(A[p1]<=B[p2]){
               C[p3] = A[p1];
               p1++;
               p3++;
            }
            else{
                C[p3] = B[p2];
                p3++;
                p2++;
            }
        }
        while(p1<n){
            C[p3] = A[p1];
            p3++;
            p1++;
        }
        while(p2<m){
            C[p3] = B[p2];
            p3++;
            p2++;
        }
        return C;
    }
}
