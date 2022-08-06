package com.RotationPrac;

import java.util.Scanner;

public class BulbFlip {

            public static void main(String args[])
            {
                
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int A[] = new int[N];
    
                for(int i=0;i<N;i++){
                    A[i] = sc.nextInt();
                }
             
                int result = solve(A);
                System.out.println("Result is :"+result);
                
            }
    
        public static int solve(int[] A) {
                
            int n = A.length;
            int count = 0;
            int flag = 0;
    
            for(int i = 0;i<n;i++){
                if(A[i]==flag){
                    count++;
                    if(flag == 0){
                        flag = 1;
                    }
                    else{
                        flag = 0;
                    }
                }
            }
            return count;
                
        }
                
}
    