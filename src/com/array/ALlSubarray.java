package com.array;

import java.util.Scanner;

public class ALlSubarray {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter Subarray Limit: ");
        int L = sc.nextInt();
        int result = solve(A,L);
        System.out.println("Result is :"+result);
    } 

	public static int solve( int[] arr,int l)
	{
	
        int n = arr.length;
		for (int i=0; i <n; i++)
		{
			for (int j=i; j<n; j++)
			{
                if(i-j==3){
                System.out.println();
				for (int k=i; k<=j; k++)
					System.out.print(arr[k]+" ");
			    }
            }
		}
        return 0;
	}

}
