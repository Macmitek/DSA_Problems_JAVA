package com.AdvArray;

public class Minimumswaps2 {
    public static void main(String[] args) {
        int[] A =  { 1,2,3,4,0};
        int res = solve(A);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A){
        int N = A.length;
        int count = 0;
        int i=0;
        while (i<N){
            if(A[i]==i){
                i++;
            }
            else{
                swap(A,i,A[i]);
                count++;
            }
        }
        return count;
    }
    public static  void swap(int[] A,int a, int b){
        int tmp = A[a];
        A[a] = A[b];
        A[b] = tmp;
    }
}
