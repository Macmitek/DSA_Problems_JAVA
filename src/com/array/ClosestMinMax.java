package com.array;

import java.util.Scanner;

public class ClosestMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        int res = solve(A);
        System.out.println("The MINMAX closest is: "+res);


    }

    public static int solve(int[]  A){

        int min = A[0];
        int max = A[0];
        int N = A.length;
        if (A.length==1){
            return 1;
        }
        for (int i = 1; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        System.out.println("Minimum is: "+min);
        System.out.println("maximum is: "+max);

        boolean min_find = false;
        boolean max_find = false;
        int ans = Integer.MAX_VALUE;
        for(int start=0; start<N;start++){
            for(int end=start; end<N;end++){
                for(int k=start; k<=end;k++){
                    if(A[k]==min){
                        System.out.println("inside if min found:"+A[k]);
                        min_find = true;
                    }
                    if(A[k]==max){
                        System.out.println("inside if max found:"+A[k]);
                        max_find = true;
                    }
                }
                if(min_find && max_find){
                    System.out.println("Inside if ");
                    System.out.println("ans and "+(end-start+1));
                    ans = Math.min(ans,end-start+1);
                    System.out.println("The ans is:"+ans);
                    return ans;
                }
            }
        }

    return -1;
    }
}
