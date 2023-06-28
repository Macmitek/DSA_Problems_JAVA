
package com.DynamicP;

import java.util.Arrays;

public class MaxSUmvalue {
    public static void main(String[] args) {
        int[] A = {1,5,-3,4,-2};
        int B=2;
        int C =1 ;
        int D=-1;
        int res = solve(A,B,C,D);
        System.out.println("The ans is:"+res);

    }
     static int[][] dp;
     static int[] p;

    public  static int solve(int[] A,int B,int C,int D){
        dp=new int[A.length][3];
        p=new int[3];

        for(int i=0;i<A.length;i++)
        {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }

        p[0]=B;
        p[1]=C;
        p[2]=D;

        return maxsum(A,p,0,0);
    }

   public static int maxsum(int[] A,int[] p,int i,int j)
    {
        if(i>=A.length)
            return Integer.MIN_VALUE;
        if(j==3)
            return 0;

        if(dp[i][j]==Integer.MIN_VALUE)
        {
            int v=maxsum(A,p,i+1,j);

            if(j<=2)
            {
                v=Math.max(v,A[i]*p[j]+maxsum(A,p,i,j+1));
            }

            dp[i][j]=v;
        }

        return  dp[i][j];
    }
}
