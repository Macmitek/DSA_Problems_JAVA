package com.AdvArray;

import java.util.Arrays;

public class maximumPowArray {
    public static void main(String[] args) {
        int[] A = {10,9,15,11,12};
        int res = solve(A);
        System.out.println("The answer is: " + res);
    }

    public static int solve(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += A[i] * (i + 1);
        }

        int[] visited = new int[A.length];
        for (int i = 0; i < A.length - 1; i++) {
            if (visited[i] != 1 && visited[i + 1] != 1) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    // Mark visited
                    visited[i] = 1;
                    visited[i + 1] = 1;
                }
            }
        }

        System.out.println("Visited array: " + Arrays.toString(visited));
        System.out.println("Swapped array: " + Arrays.toString(A));

        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            temp += A[i] * (i + 1);
        }

        if (temp > ans)
            return temp;
        return ans;
    }
}
