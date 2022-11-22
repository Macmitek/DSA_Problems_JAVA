package com.prac;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] A = {8,15,16,3,10};
        int[] B = {2,1,1};
        int[] C = {2,3,1};
        int res = solve(A,B,C);
        System.out.print("Ans is :"+res);
    }
    public   static int solve(int[] A,int[] B,int[] C){
        ArrayList<Integer> temp = new  ArrayList<>();
        int N = A.length;
        for(int i=0;i<N;i++){
            temp.add(A[i]);
        }

       for(int i=0;i<C.length;i++){
           int val = C[i];
           System.out.println(" val in for i:"+i+" is :"+val);
           for(int j=0;j<B.length;j++){
               System.out.println("Valu of j:"+j);
               int count = 0;
               for(int k=0;k<B[j];k++){
                   count++;
                   System.out.println("value of k and B[j] :"+k+ " " + B[j]);
                   System.out.println("Value of temp.get(k): "+temp.get(k));
                   if(temp.get(k+count)>val){
                       System.out.println("inside if: ");
                       temp.set(k+count,val);
                   }
               }
           }
       }


        System.out.println(temp);
        return 0;
    }
}
