package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class AlTSubarray {

   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arraylist size: ");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter Arraylist Elements: ");
        for(int i=0;i<N;i++){
           A.add(sc.nextInt());
        }

        System.out.println("Enter  Limit: ");
        int L = sc.nextInt();
        ArrayList<Integer> result = solve(A,L);
        int len = result.size();
        for(int i=0;i<len;i++){
           System.out.println(" "+ result.get(i));
       }

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B)
    {
        int n = A.size();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int c = B;c<n-B;c++) {
            int val = A.get(c);
            int iscenter = 1;
            int l = c - 1;
            int r = c + 1;
            for (int i = 0; i < B; i++) {
                val = 1 - val;

                if (A.get(l) == val && A.get(r) == val) {
                    l--;
                    r++;
                    continue;
                }else{
                    iscenter = 0;
                    break;
                }


            }
            if(iscenter==1){
                int center = (l+r)/2;
                res.add(center);
            }
        }
        return res;
    }

}
