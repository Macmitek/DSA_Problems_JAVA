package com.BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int[] res = solve(A);
        System.out.println(" "+res[0]+" "+res[1]);
    }
    public  static int[] solve(int[] A){
        int N = A.length;
        int[] ans = new int[2];

        //xoring all elements
        int xor_all=0;
        for(int i=0;i<N;i++){
           xor_all=xor_all^A[i];
        }

        // finding set bits
        int tmp = xor_all;
        int bit=0;
        while((tmp&(1<<bit))==0){
            bit++;
        }

        //seperating acc to bit
        int ele1 =0;
        int ele2=0;
        for(int i=0;i<N;i++){
            if((A[i]&(1<<bit))!=0){
                ele1 = ele1^A[i];
            }else
            {
                ele2 = ele2^A[i];
            }
        }
        ans[0]=ele1;
        ans[1]=ele2;

        return ans;
    }
}
