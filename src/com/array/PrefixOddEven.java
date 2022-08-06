package com.array;

import java.util.Scanner;

public class PrefixOddEven {

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
            System.out.println("The Count is: "+res);


        }

        public static int solve(int[]  A){
            int N = A.length;
            int[] PE = new int[N];
            int[] PO = new int[N];

            PO[0]=0;
            PE[0]=A[0];

            for(int i =1; i < N; i++) {
                if (i % 2 == 0) {
                    PE[i] = PE[i - 1] + A[i];
                    PO[i] = PO[i-1];
                }else{
                    PO[i] = PO[i-1] + A[i];
                    PE[i] = PE[i-1];
                }
            }

            int count=0;
            int even = 0;
            int odd = 0;
            for(int i =0 ;i<N;i++){
                if(i==0){
                    even = (PO[N-1] - PO[i]);
                    odd = (PE[N-1] - PE[i]);
                }else{
                    even = PE[i-1] + (PO[N-1] - PO[i]);
                    odd = PO[i-1] + (PE[N-1] - PE[i]) ;
                }
                if(even == odd){
                    count++;
                }
            }
            return count;
        }
    }
