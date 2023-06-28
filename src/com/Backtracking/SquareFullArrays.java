package com.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SquareFullArrays {
    static int  cnt ;
    static HashSet<ArrayList<Integer>> set = new HashSet<>();
     public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 2,2,2));
        int ans  =  solve(A);
        System.out.println("the ans is :"+ans);
    }

    public  static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> curr =  new ArrayList<>();
        int n = A.size();
        cnt = 0;
        boolean istaken[] = new boolean[n];
        helper(A,curr,n,istaken);
        return cnt;
    }

    public static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public static void helper(ArrayList<Integer> A, ArrayList<Integer> curr, int size,boolean[] istaken) {
        if (size == curr.size()) {
            System.out.println("Curr list :" + curr);
            if (!set.contains(curr)) {
                set.add(curr);
                cnt++;
                return;
            }
        }
        for (int i = 0; i < size; i++) {

            if(i > 0 && A.get(i-1) ==  A.get(i) && !istaken[i-1]){
                continue;
            }
            if(!istaken[i]){
                if(curr.size() > 0) {
                    int sum = curr.get(curr.size() - 1) + A.get(i);
                    if(!isPerfectSquare(sum)) {
                        continue;
                    }
                }

                istaken[i] = true;
                curr.add(A.get(i));
                helper(A, curr, size, istaken);
                istaken[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }
}
