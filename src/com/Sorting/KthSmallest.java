package com.Sorting;

public class KthSmallest {
   public static void main(String[] args) {
        int[] A = {110,56,78,7,9,0};
        int B = 3;
        int res = solve(A,B);
//        for(int i:res){
//            System.out.print(" "+i);
//        }
        System.out.println("Ans is:"+res);

    }
    public  static int solve(int[] A,int B){
        int n = A.length;
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int ind = -1;
            for(int j=i;j<n;j++){
                if(A[j]< min){
                    min = A[j];
                    ind = j;
                }
            }
            int temp = A[i];
            A[i] = A[ind];
            A[ind] = temp;
        }
        return A[B-1];
    }
}
