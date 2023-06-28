package com.Backtracking;

public class uniquepath3 {
    public static void main(String[] args) {
        int[][] A = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        int res = solve(A);
        System.out.println("The ans is :"+res);
    }
    public  static int solve(int[][] A) {
            int si = 0,sj = 0,totalZeros= 0,zeroCount = 0;
            for(int i=0;i<A.length;i++){
                for(int j=0;j<A[0].length;j++){
                    if(A[i][j] == 1){
                        si=i;
                        sj =j;
                    }
                    else if(A[i][j] == 0){
                        totalZeros++;
                    }
                }
            }
            return countPath(si,sj,A,totalZeros,zeroCount);
        }
        public   static int countPath(int si,int sj,int[][] A,int totalZeros,int zeroCount){

            if(si<0 || si>=A.length || sj<0 || sj >=A[0].length || A[si][sj] < 0){
                return 0;
            }
            // if(A[si][sj] == 1 || A[si][sj] == -1 ){
            //     return 0;
            // }
            if(A[si][sj] == 2){
                if(zeroCount == totalZeros){
                    return 1;
                }
                return 0;
            }
            if(A[si][sj] == 0) {
                zeroCount++;
            }

            A[si][sj] = -2;
            // int temp = A[si][sj];
            int ans = countPath(si-1, sj, A, totalZeros, zeroCount) +
                    countPath(si+1, sj, A, totalZeros, zeroCount) +
                    countPath(si, sj-1, A, totalZeros, zeroCount) +
                    countPath(si, sj+1, A, totalZeros, zeroCount);

            //A[si][sj] =temp;
            A[si][sj] = 0;
            return ans;
        }

}
