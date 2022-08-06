package com.array;

import java.util.Scanner;

public class Minaveragesum {
    
    public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int A[] = new int[N];

            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
            }

            System.out.println("Enter Subarray Limit: ");
            int L = sc.nextInt();
            int result = solve(A,L);
            System.out.println("Result is :"+result);
    }



    public static int solve(int[] A,int B) {
        int minsum = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 0; i <= A.length - B; i++){
            int sum = 0;
            for(int j = i; j < i + B; j++){
                    sum = sum + A[j];
            }
            if(sum < minsum){
                minsum = sum;
                index = i;
            }
        }
        return index;
        }
    }
    


