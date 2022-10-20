package com.Sorting;

public class BitonicPoint {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        int B = 12;
        int res = solve(A,B);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A, int B){
        int piv = findPivot(A);
        if(A[piv]==B) return piv;

        int l=0;
        int r = piv-1;

        while(l<=r){
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

         l=piv+1;
         r = A.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid]==B){
                return mid;
            }
            else if(A[mid]<B){
                r = mid-1;
            }
            else{

                l = mid+1;
            }
        }

        return -1;
    }
    public static int findPivot(int[] A){
        int l=0;
        int r = A.length -1;


        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid]>A[mid-1] && A[mid]>A[mid+1]){
                return mid;
            }
            else if(A[mid]>A[mid-1] && A[mid]<A[mid+1]){
                l = mid +1;
            }
            else{
                r = mid -1;
            }

        }
        return -1;
    }

}
