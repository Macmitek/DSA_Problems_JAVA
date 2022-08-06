package com.Sorting;

import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class ElementsRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        int res = solve(A);
        System.out.println("Result is:"+res);
    }
    public static int solve(ArrayList<Integer> A){
        int N = A.size();
        Collections.sort(A, Collections.reverseOrder());
        int cost = 0;
        for(int i=0;i<N;i++){
            cost = cost + (i+1)*A.get(i);
        }


        return cost;
    }
}
