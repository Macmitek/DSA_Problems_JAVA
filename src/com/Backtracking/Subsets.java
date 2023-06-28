package com.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Subsets {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(9, -20, -11, -8, -4, 2, -12, 14, 1, -18));
        subsets(A);
        System.out.println("ANs arr:"+ans);

    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<Integer> currList = new ArrayList<>();
        ans.add(currList);
        Collections.sort(A);

        helper(currList,0,A);
        return ans;
    }
    public  static void helper(ArrayList<Integer> currList, int idx, ArrayList<Integer> A){

        if(idx ==  A.size()){
            ans.add(new ArrayList<>(currList));
            return;
        }

        currList.add(A.get(idx));
        helper(currList,idx+1,A);
        currList.remove(A.get(idx));
        helper(currList,idx+1,A);

    }
}
