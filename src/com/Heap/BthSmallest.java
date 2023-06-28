package com.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class BthSmallest {
    public static void main(String[] args) {
        int[][] A = { {9,11,15},
                {10,15,17}
        };

        int res =  solve(A,5);
        System.out.println("the ans is :"+res
        );
    }
//    public  static  int solve(int[][] A,int B){
//        int n = A.length;
//        int m = A[0].length;
//        int low = A[0][0];
//        int high = A[n-1][m-1];
//        while (low < high) {
//            int mid = (low + high) / 2;
//            int count = 0;
//            int j = m - 1;
//            for (int i = 0; i < n; i++) {
//                while (j >= 0 && A[i][j] > mid) {
//                    j--;
//                }
//                count += (j + 1);
//            }
//            if (count < B) {
//                low = mid + 1;
//            } else {
//                high = mid;
//            }
//        }
//        return low;
//    }
    public  static  int solve(int[][] A,int B){
        int n = A.length;
        int m = A[0].length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int curr = A[i][j];
                if(maxHeap.size() <B){
                    maxHeap.add(curr);
                }
                else{
                    if(maxHeap.peek()>curr){
                        maxHeap.poll();
                        maxHeap.add(curr);
                    }
                }
            }
        }
        return  maxHeap.poll();
    }
}
