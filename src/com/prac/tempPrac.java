package com.prac;

public class tempPrac {
   public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][] A = {{-5, -4, -3}, {-1, 2, 3}, {2, 2, 4}};
        long res = pfsumnew(A);
        System.out.println("Ans is:" + res);
    }

    public static int solve(int[][] A) {
        int[][] pre = pfsum(A);
        int n = A.length;
        int m = A[0].length;
        int ans = pre[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans,pre[i][j]);
            }
        }
        return 0;
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
    public  static long pfsumnew(int[][] a){
        int n = a.length;//row
        int m = a[0].length;//cols
        long[][] pre = new long[n][m];
        pre[0][0] = a[0][0];
        long ans = pre[0][0];

        for(int i=1;i<n;i++){
            pre[i][0] = pre[i-1][0] + a[i][0];
            ans = Math.max(ans, pre[i][0]);
        }
        for(int i=1;i<m;i++){
            pre[0][i] = pre[0][i - 1] + a[0][i];
            ans = Math.max(ans, pre[0][i]);
        }

        for(int i=1;i<n;i++){
            for(int  j=1;j<m;j++){
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + a[i][j];
                ans = Math.max(ans, pre[i][j]);
            }
        }

        return ans;
    }

}
