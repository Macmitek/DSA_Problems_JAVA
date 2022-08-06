package com.prac;


import java.util.Scanner;

public class LP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int result = solve(arr,B);
        System.out.println(result);

    }
    public static int solve(int[] A,int B ){

            int count = 0;
            int flag = 0;

            for(int i = 0; i<A.length; i++){

                if(A[i] == B){
                    flag = 1;
                }
            }
            for(int j = 0 ; j < A.length; j++)
            {
                if(A[j] > B){
                    count++;
                }
            }

            if(flag != 0){
                return count;
            }
            return -1;
        }
    }







