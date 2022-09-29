package com.AdvMaths;

public class PairSumbyM {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int B = 2;
        int res = solve(arr,B);
        System.out.println("Ans is : "+res);
    }
    public  static  int solve(int[] A,int B){
        int N = A.length;
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp = A[i]+A[j];
                if(temp%B==0){
                    count++;
                }
            }
        }
        return  count;
    }
}
