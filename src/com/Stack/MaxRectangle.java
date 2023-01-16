package com.Stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxRectangle {
    public static void main(String[] args) {
        int[][] A = {{0,0,1},{0,1,1},{1,1,1}};
        int res = solve(A);
        System.out.println("Ans is:"+res);
    }
    public static int solve(int[][] A){
        int M = A.length;
        int N = A[0].length;
        int[] currRow = A[0];
        int maxArea = largestRectangleArea(currRow);
        for(int i=1;i<M;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]==1){
                    currRow[j]+=1;
                }
                else{
                    currRow[j]=0;
                }
            }
            int currAns = largestRectangleArea(currRow);
            maxArea = Math.max(maxArea,currAns);
        }
        return maxArea;
    }
    public  static int largestRectangleArea(int[] A) {
        System.out.println("Array in histogram: "+ Arrays.toString(A));
        int N = A.length;
        if(N==1){
            return A[0];
        }
        int[]  SL = nearestSmallerLeft(A);
        int[]  SR = nearestSmallerRight(A);

        int maxArea = Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            int area = A[i] * (SR[i] - SL[i] - 1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }


    public static int[] nearestSmallerLeft(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<N; i++){

            while(!st.isEmpty() && A[st.peek()]>=A[i]){
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = -1;

            else
                ans[i] = st.peek();


            st.push(i);
        }
        return ans;
    }
    public  static  int[] nearestSmallerRight(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i=N-1; i>=0; i--){

            while(!st.isEmpty() && A[st.peek()]>=A[i]){
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = N;

            else
                ans[i] = st.peek();


            st.push(i);
        }
        return ans;
    }

}
