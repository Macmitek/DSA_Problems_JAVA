package com.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class alluniqpermu {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    static HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,1,2));
        ArrayList<ArrayList<Integer>> ans  =  permute(A);
        System.out.println(Arrays.deepToString(new ArrayList[]{ans}));
    }
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> currList = new ArrayList<>();
        boolean istaken[] = new boolean[n];
        getAllSubsets(currList,istaken,A);
        return ans;
    }
    public static void getAllSubsets(ArrayList<Integer> currList,boolean[] istaken,ArrayList<Integer> A) {
        if (A.size() == currList.size()) {
            System.out.println("If currlist == total size");
            if (!set.contains(currList)) {
                set.add(currList);
                ArrayList<Integer> temp = new ArrayList<>(currList);
                ans.add(temp);
            }
            return;
        }
        System.out.println("Boolean array  :"+Arrays.toString(istaken));
        for (int i = 0; i < A.size(); i++) {
            if (!istaken[i]) {
                istaken[i] = true;
                currList.add(A.get(i));
                System.out.println("Currlist before :"+currList);
                getAllSubsets(currList, istaken, A);
                System.out.println("Currlist after  :"+currList);
                istaken[i] = false;
                currList.remove(currList.size() - 1);
            }

        }

    }
}
