package com.Practise;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxPosstemp {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arraylist size: ");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter Arraylist  Elements: ");
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        ArrayList<Integer> res = solve(A);
//        for(int j = 0;j<res.size();j++){
//            System.out.println(" "+res.get(j));
//        }
    }

    public static ArrayList<Integer> solve( ArrayList<Integer> arr)
    {
        int n = arr.size();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i=0; i <n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println();
                for (int k = i; k <= j; k++) {
                    if(arr.get(k)>0){
                        System.out.print(" "+arr.get(k));
                    }
                }

            }
        }
        return arr;
    }

}
