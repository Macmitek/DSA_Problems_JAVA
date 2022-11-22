package com.Stack;

import java.util.Stack;

public class MAXMIN {
    public static void main(String[] args) {
        int[] A = {4,7,3,8};
        int res = solve(A);
        System.out.println("Ans is:"+res);
    }

    public  static int solve(int[] A){
            int N = A.length;
            if(N==1){
                return 0;
            }
            int mod =  1000 * 1000 *1000 + 7;
            int[]  SL  =  nearestSmallerLeft(A);
            int[]  SR =   nearestSmallerRight(A);
            int[]  ML =   nearestMaximumLeft(A);
            int[]  MR =   nearestMaximumRight(A);
            int sum =  0;

            for(int i=0;i<N;i++){
                int tempMin = ( (i - SL[i]) * (SR[i] - i)) % mod;
                int min = (tempMin * A[i]) % mod;

                int tempMax = ( (i - ML[i]) * (MR[i] - i)) % mod;
                int max = (tempMax * A[i]) % mod;


                sum = ((sum%mod) + ((max -  min)%mod))%mod;
            }
            if(sum < 0){
                sum = (sum + mod) %mod;
            }
            return sum%mod;
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
    public  static int[] nearestMaximumLeft(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<N; i++){
            while(!st.isEmpty() && A[st.peek()]<=A[i]){
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


    public static int[] nearestSmallerRight(int[] A) {
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


    public static int[] nearestMaximumRight(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i=N-1; i>=0; i--){
            while(!st.isEmpty() && A[st.peek()]<=A[i]){
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

