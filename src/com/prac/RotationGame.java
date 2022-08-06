package com.prac;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NA = sc.nextInt();

        //{ 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };

        int A[] =     new int[NA];
        for (int i=0;i<NA;i++) {
            A[i] = sc.nextInt();
        }
        int NB = sc.nextInt();

        //{88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 };

        int B[] = new int[NB];
        for (int i=0;i<NB;i++) {
            B[i] = sc.nextInt();
        }

        RotationGame obj = new RotationGame();
        int result[][] = obj.solve(A,B);

        for(int i =0;i<NB;i++) {
            for (int j = 0; j < NA; j++) {
                System.out.print(result[i][j]+" ");
            }
        }

    }
    public static int[][] solve(int[] A,int[] B ){

        int NA = A.length;
        int NB = B.length;
        //System.out.println("Length of A: "+NA+" B :"+NB);
        int[][] C = new int[NB][NA];
        int[] temp = new int[NA];
        for(int i =0;i<NB;i++) {
          temp = leftrotate(A,B[i]);
          C[i] = temp;
        }
        return C;
    }
    public  static  int[] leftrotate(int[] A,int k){
        int N = A.length;
        int narr[] =  new int[N];
        for(int j = 0;j<N;j++){
            narr[j] =  A[((j+k))%N];
        }
        return narr;
    }

}

