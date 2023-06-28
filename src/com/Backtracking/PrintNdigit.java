package com.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintNdigit {
    static ArrayList<ArrayList<Integer>> finalList;
    static int steps = 0;

    public static void main(String[] args) {
        int n = 2;
        finalList = new ArrayList<ArrayList<Integer>>();
        helper(n, 0, new ArrayList<Integer>());
        for (ArrayList<Integer> arr : finalList) {
            System.out.println(arr);
        }
        System.out.println("size:"+finalList.size());
    }

    public static void helper(int n, int idx, ArrayList<Integer> current) {
        if (idx == 3) {
            finalList.add(new ArrayList<Integer>(current));
            return;
        }
        for (int i = 1; i <= n; i++) {
            current.add(i);
            helper(n, idx + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
