package com.RotationPrac;

import java.util.Scanner;

public class MinFLip {


 
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

        for(int i = 0;i<n;i++){
            
            if(A[i]==0){
                count++;
                System.out.println("count: "+count);
                for(int j = i ;j<n ;j++){
                   
                    if(A[j]==0){
                        A[j]=1;
                    }
                    else{
                        A[j]=0;
                    }
                }
            }
            
        }
        
        for(int i=0;i<n;i++){
            System.out.print(" "+A[i]);
        }
       
        return count;
            
        }
            
    }
