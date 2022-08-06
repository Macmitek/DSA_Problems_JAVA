package com.Array;

import java.util.Scanner;

public class SubArraylessthanB {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter Sum Limit: ");
        int B = sc.nextInt();
        int result = solve(A,B);
        System.out.println("Result is :"+result);
    }   

    public static int solve(int[] A, int B) {

        int n = A.length;
        int total = 0;

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum = sum+A[j];
                if(sum<B)
                    total++;
            }
        }
        return total;
    }
    
}
