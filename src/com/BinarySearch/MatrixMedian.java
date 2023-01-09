package com.BinarySearch;

public class MatrixMedian {
    public static void main(String[] args) {
        int[][] A = {{1,3,5},{2,6,9},{3,6,9}};
        int res = solve(A);
        System.out.println("Ans is : "+res);
    }
    public  static  int solve(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int l =  Integer.MAX_VALUE;
        int r =  Integer.MIN_VALUE;
        for(int i = 0; i<A.length;i++){
            l = Math.min(l,A[i][0]);
            r = Math.max(r,A[i][m - 1]);
        }
        int ans = 0;
        while(l<=r){
            int mid = (r-l)/2 +l;
            if(elementsSmaller(mid,A)> (m*n)/2){
                r = mid - 1;
            }
            else{
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
    public  static int  elementsSmaller(int val, int[][] A){
        int cnt = 0;
        for(int i=0;i<A.length;i++){
            cnt+=smaller(val,A[i]);
        }
        return  cnt;
    }
    public static  int smaller(int val, int[] A){
        if(A[0] >= val ) return  0;
        int l = 0;
        int r = A.length-1;
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid] >= val){
                r =  mid -1;
            }
            else{
                ans = mid;
                l = mid +1;
            }
        }
        return ans +1 ;
    }
}
