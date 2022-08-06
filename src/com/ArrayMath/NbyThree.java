package com.ArrayMath;

import java.util.Scanner;

public class NbyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int res = majorityElement(A);
        System.out.println("Result is:"+res);

    }
    public static int majorityElement(final int[] A) {
        int ele1=Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int N = A.length;
        int f1 = 0;
        int f2 = 0;
        for(int i=0;i<N;i++){
            if(f1==0){
                ele1 = A[i];
                f1=1;
            }
            else if(f2==0){
                ele2 = A[i];
                f2=1;
            }
            else if(A[i]==ele1){
                f1++;
            }
            else if(A[i]==ele2){
                f2++;
            }
            else{
                f1--;
                f2--;
                if(f1==0){
                    ele1 = Integer.MIN_VALUE;
                }
                else if(f2==0){
                    ele2 = Integer.MIN_VALUE;
                }
            }
        }
        f1 =0;
        f2 =0;
        for (int i = 0; i < N; i++) {
            if (A[i] == ele1)
                f1++;

            else if (A[i] == ele2)
                f2++;
        }

        if (f1 > N / 3)
            return ele1;

        if (f2 > N / 3)
            return ele2;

        return -1;
    }

}
