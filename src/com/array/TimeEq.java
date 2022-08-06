package com.array;

import java.util.Scanner;

public class TimeEq {

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
            System.out.println("The equilibrium index is: "+res);


        }

        public static int solve(int[]  A){
            int N = A.length;
            int[] PS = new int[N];

            PS[0]=A[0];
            for(int i =1; i < N; i++) {
                PS[i] = PS[i - 1] + A[i];
            }

            int sR = 0;
            int sL = 0;
            for(int i =0 ;i<N;i++){
                if(i==0){
                    sL = 0;
                }
                else{
                    sL = PS[i-1] ;
                }
                sR = PS[N-1] - PS[i];

                if(sL == sR){
                    return i;
                }
            }
            return -1;
        }
    }

