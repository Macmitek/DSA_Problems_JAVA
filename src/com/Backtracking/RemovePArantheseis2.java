package com.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovePArantheseis2 {

    static HashSet<String> set = new HashSet<>();
    static int off_left;
    static int off_right;

    public static void main(String[] args) {
        String A = "(a)())()";
        ArrayList<String> ans = solve(A);
        System.out.println("The list is :" + ans);
    }

    public static ArrayList<String> solve(String A) {
        off_left = 0;
        off_right = 0;
        set_off_counts(A);
        backtrack(0, A, "", 0);
        System.out.println("The final set is :" + set);
        ArrayList<String> anslist = new ArrayList<>();
        anslist.addAll(set);
        return anslist;
    }

    public static void backtrack(int index, String s, String curr, int balance) {
        if (index == s.length()) {
            if (off_left == 0 && off_right == 0 && balance == 0) {
                set.add(curr);
            }
            return;
        }

        char ch = s.charAt(index);
        if (ch == '(' && off_left > 0) {
            backtrack(index + 1, s, curr, balance);
            off_left--;
        } else if (ch == ')' && off_right > 0) {
            backtrack(index + 1, s, curr, balance);
            off_right--;
        } else if (ch != '(' && ch != ')') {
            backtrack(index + 1, s, curr + ch, balance);
        } else {
            // Include the current character
            if (ch == '(') {
                off_left--;
                balance++;
            } else if (ch == ')') {
                off_right--;
                balance--;
            }
            backtrack(index + 1, s, curr + ch, balance);

            // Exclude the current character
            if (ch == '(') {
                off_left++;
                balance--;
            } else if (ch == ')') {
                off_right++;
                balance++;
            }
            backtrack(index + 1, s, curr, balance);
        }
    }

    public static void set_off_counts(String A) {
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                off_left++;
            }
            if (A.charAt(i) == ')') {
                if (off_left > 0) {
                    off_left--;
                } else {
                    off_right++;
                }
            }
        }
    }
}
