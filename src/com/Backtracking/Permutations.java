package com.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<ArrayList<Integer>> ans  =  permute(A);
        System.out.println(Arrays.deepToString(new ArrayList[]{ans}));
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> curr = new ArrayList<>();
        helper(curr,n,A);
        return ans;
    }
    public static void helper(ArrayList<Integer> currList, int idx, ArrayList<Integer> A) {

        if(idx ==  currList.size()){
            ans.add(new ArrayList<>(currList));
            return;
        }

        for (int i = 0; i < idx; i++) {
            if(currList.contains(A.get(i))){
                continue;
            }
            currList.add(A.get(i));
            helper(currList,idx, A);
            currList.remove(currList.size() - 1);

        }
    }
}
