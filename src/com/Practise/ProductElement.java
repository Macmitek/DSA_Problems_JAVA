package com.Practise;

import java.util.Scanner;

public class ProductElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        int res[] =solve(A);
        System.out.println("The final array:");
         for(int j = 0 ; j< res.length ; j++){

            System.out.print(res[j]+" ");
        }


    }

    public static int[] solve(int[]  A){
        int N = A.length;
        int[] PL = new int[N];
        int[] PR = new int[N];

        PL[0] = A[0];

        for(int i=1;i<N;i++){
            PL[i] = PL[i-1] * A[i];
        }

        PR[N-1] = A[N-1];
        for(int i=N-2;i>=0;i--){
            PR[i] = PR[i+1] * A[i];
        }

        int ans[] = new int[N];
        if (A.length ==1){
            ans[0] = A[0];
        }else{
            ans[0] = PR[1];
            ans[N-1] = PL[N-2];
        }

        for(int i=1; i<=N-2;i++) {
            ans[i] = PL[i - 1] * PR[i + 1];
        }

      return ans;
    }
}
