package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RepeatingElement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size for Array A::");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter elements for array A:");
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }

        int res = solve(A);
        System.out.println("Ans is :"+res);

    }
    public static int solve(ArrayList<Integer> A){

        int min = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i=A.size()-1; i>=0; i--)
        {
            System.out.println("Aget: "+A.get(i));
            if (set.contains(A.get(i))){
                min = i;
            }
            else   {
                set.add(A.get(i));
            }
        }
        if (min != -1)
            return A.get(min);
        else
            return -1;

    }
}
