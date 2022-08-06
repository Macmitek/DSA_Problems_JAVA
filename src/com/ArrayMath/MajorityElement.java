package com.ArrayMath;

import java.util.Scanner;

public class MajorityElement {
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
        int ele=Integer.MIN_VALUE;
        int N = A.length;
        int f = 0;
        for(int i=0;i<N;i++){
            if(f==0){
                ele = A[i];
                f=1;
            }
            else if(A[i]==ele){
                f++;
            }
            else{
                f--;
                if(f==0){
                    ele = Integer.MIN_VALUE;
                }
            }
        }

        return ele;
    }

}
