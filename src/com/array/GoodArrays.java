package com.array;

import java.util.Scanner;

public class GoodArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter Limit: ");
        int B = sc.nextInt();
        int res = solve(A,B);
        System.out.println("The Max amount possible is: "+res);


    }
    public static int solve(int[] A, int B) {

        int n = A.length;
        int total = 0;

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                int subsize = j-i+1;
                sum = sum+A[j];
                if((sum<B && subsize%2==0) || (sum>B && subsize%2==1))
                    total++;

            }
        }
        return total;
    }
}
