package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumAllSubarrayPositive {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter Array Elements: ");
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
        int max = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i=0; i <n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    if(arr.get(k)>0){
                        sum = sum + arr.get(k);
                    }
                }
                if(sum>max){
                    max = sum;
                }
            }
        }
        return arr;
    }

}
