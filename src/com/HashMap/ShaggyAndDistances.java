package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ShaggyAndDistances {
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
    public  static int solve(ArrayList<Integer> A){
        HashMap<Integer,Integer> set = new HashMap<>();
        int N = A.size();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(set.containsKey(A.get(i))){
               int prev = set.get(A.get(i));
               int diff = Math.abs((i-prev));
               ans = Math.min(ans,diff);
            }else{
                set.put(A.get(i),i);
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;

        }else{
            return ans;
        }
    }
}
