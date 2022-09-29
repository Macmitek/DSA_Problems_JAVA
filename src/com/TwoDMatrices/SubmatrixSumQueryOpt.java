package com.TwoDMatrices;

public class SubmatrixSumQueryOpt {

        public static void main(String[] args) {
            int[][] A = { {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            int[] B = {1,2};
            int[] C = {1,2};
            int[] D = {2,3};
            int[] E = {2,3};
            int[] res  = solve(A,B,C,D,E);
            System.out.println("Ans is:"+res[0]+" "+res[1]);
        }

        public static int[] solve(int[][] A,int[] B,int[] C,int[] D,int[] E){
            long[][] pre = pfsum(A);
            int[] res = new int[B.length];

            for(int i=0;i<B.length;i++){
                int a1=  B[i];
                int b1=  C[i];
                int a2 = D[i];
                int b2 = E[i];

                long sum =  pre[a2][b2] - pre[a1-1][b2]- pre[a2][b1-1]+ pre[a1- 1][b1 - 1];

                long mod = 1000000007;
                if ((sum%mod) < 0) {
                    sum = (sum%mod+ mod) % mod;
                    res[i] = (int)(sum%mod);
                } else {
                    res[i] = (int)(sum%mod);
                }
            }
            return res;
    }
    public static long[][] pfsum(int[][] a){
        int n = a.length;//row
        int m = a[0].length;//cols

        long[][] pre = new long[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int  j=1;j<=m;j++){
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + a[i-1][j-1];
            }
        }

        return pre;
    }
}


/*

 */