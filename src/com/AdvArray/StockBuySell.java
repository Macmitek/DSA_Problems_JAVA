package com.AdvArray;

public class StockBuySell {
    public static void main(String[] args) {
        int[] A = {7,1,5,3,6,4};
        int res = solve(A);
        System.out.println("the ans is :"+res);
    }
//    public  static  int solve(int[] A){
//        int n = A.length;
//        int maximum_profit = 0;
//        for(int i=0;i<n;i++){
//
//            for(int j = i;j<n;j++){
//                if(A[j]>A[i]){
//                    maximum_profit = Math.max(maximum_profit,A[j]-A[i]);
//                }
//            }
//        }
//        return  maximum_profit;
//    }
    public  static  int solve(int[] A){
        int n = A.length;
        int maximum_profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,A[i]);
            maximum_profit = Math.max(maximum_profit,A[i]-min);
        }
        return  maximum_profit;
    }
}
