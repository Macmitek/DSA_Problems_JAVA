package com.AdvArray;

public class MatrixSumsorted {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][] A = {{-5, -4, -3}, {-1, 2, 3}, {2, 2, 4}};
        int res = solve(A);
        System.out.println("Ans is:" + res);
    }

    public static int solve(int[][] A) {
        int[][] pre = pfsum(A);
        int n = A.length;
        int m = A[0].length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, matrixSum(pre, i, j, n - 1, m - 1));
            }
        }
        return 0;
    }

    public static int matrixSum(int[][] pre, int a1, int b1, int a2, int b2) {

        int sum =  pre[a2][b2];

        if (a1!= 0){
            sum = sum - pre[a1-1][b2];
        }
        if (b1!= 0){
            sum = sum - pre[a2][b1-1];
        }
        if (a1!= 0 && b1!= 0){
            sum = sum + pre[a1- 1][b1 - 1];
        }
        //int sum = pre[a2][b2] - pre[a1 - 1][b2] - pre[a2][b1 - 1] + pre[a1 - 1][b1 - 1];
        System.out.println("Sum in matrix sum:" + sum);
        return sum;
    }

    public static int[][] pfsum(int[][] a) {
        int n = a.length;//row
        int m = a[0].length;//cols

        int[][] pre = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + a[i - 1][j - 1];
            }
        }

        return pre;
    }
    public long solve3(int[][] A) {
        // S[i][j] = A[i][j] + S[i][j+1] + S[i+1][j] - S[i+1][j+1];
        int M = A.length - 1;
        int N = A[0].length - 1;
        // Becuase of long need to take temp. So space complexity is O(M+N) or else it would be 1 i.e. constant
        long[][] temp = new long[M+1][N+1];
        long max = Long.MIN_VALUE;
        for (int i = M; i > -1; i--) {
            for (int j = N; j > -1; j--) {
                temp[i][j] = A[i][j];
                if (j + 1 <= N) {
                    temp[i][j] += temp[i][j + 1];
                }
                if (i + 1 <= M) {
                    temp[i][j] += temp[i + 1][j];
                }
                if (j + 1 <= N && i + 1 <= M) {
                    temp[i][j] -= temp[i + 1][j + 1];
                }
                max = Math.max(max, temp[i][j]);
            }
        }
        return max;
    }

    public static long solve5(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        long suff[][] = new long[n][m];
        suff[n - 1][m - 1] = A[n - 1][m - 1];
        long ans = suff[n - 1][m - 1];
        for(int j = m - 2 ; j >= 0 ; j--){
            suff[n - 1][j] = suff[n - 1][j + 1] + A[n - 1][j];
            ans = Math.max(ans, suff[n - 1][j]);
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            suff[i][m - 1] = suff[i + 1][m - 1] + A[i][m - 1];
            ans = Math.max(ans, suff[i][m - 1]);
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j = m - 2 ; j >= 0 ; j--){
                suff[i][j] = A[i][j] + suff[i + 1][j] + suff[i][j + 1] - suff[i + 1][j + 1];
                ans = Math.max(ans, suff[i][j]);
            }
        }
        return ans;
    }

}
