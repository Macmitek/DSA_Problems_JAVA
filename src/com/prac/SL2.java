package com.prac;

public class SL2 {

    public int solve(int[] A) {
        if (A.length <= 1)
            return -1;

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                second_max = max;
                max = A[i];
            } else if (A[i] > second_max && A[i] != max) {
                second_max = A[i];
            }
        }
        // to handle edge case
        if (second_max == Integer.MIN_VALUE) {
            return max;
        }
        return second_max;
    }
}