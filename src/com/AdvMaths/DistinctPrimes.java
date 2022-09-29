package com.AdvMaths;

public class DistinctPrimes {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int res = solve(A);
        System.out.println("Ans is:"+res);
    }
    public  static  int solve(int[] A){

        return 0;
    }
    public long[][] pfsum(int[][] a){
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
    public long[][] pfsum1(int[][] a){
        int n = a.length;//row
        int m = a[0].length;//cols

        long[][] pre = new long[n][m];
        pre[0][0] = a[0][0];

        for(int i=1;i<n;i++){
            pre[i][0] = pre[i-1][0] + a[i][0];
        }
        for(int i=1;i<m;i++){
            pre[0][i] = pre[0][i - 1] + a[0][i];
        }

        for(int i=1;i<n;i++){
            for(int  j=1;j<m;j++){
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + a[i][j];
            }
        }

        return pre;
    }
}
