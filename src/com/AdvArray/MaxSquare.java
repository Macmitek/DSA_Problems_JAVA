package com.AdvArray;

public class MaxSquare {
    public static void main(String[] args) {
        int[][] A = {{1,1,1,1,1},{2,2,2,2,2},{3,8,6,7,3},{4,4,4,4,4},{5,5,5,5,5}};
        int B = 3;
        int res  = solve(A,B);
        System.out.println("Ans is:"+res);
    }
    public static int solve(int[][] A, int B) {

        long[][] pre = pfsum(A);
        long max = Long.MIN_VALUE;

        int r = A.length;
        int c = A[0].length;

        long cur_sum = 0;
        for(int i=B;i<=r;i++){
            for(int j=B;j<=c;j++){
                int a1=  i-(B-1);
                int b1=  j-(B-1);
                int a2 = i;
                int b2 = j;

                cur_sum=  pre[a2][b2] - pre[a1-1][b2]- pre[a2][b1-1]+ pre[a1-1][b1-1];
                max = Math.max(cur_sum,max);
            }
        }
        return (int)max;
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
