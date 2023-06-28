package com.DynamicP;

public class MaxProduct {
    public static void main(String[] args) {
        int[] A = {4,2,-5,1};
        int res = maxProduct(A);
        System.out.println("the ans is :"+res);
    }
    public static int maxProduct( int[] A) {
        return maxProductC(A, A.length);
    }
    public static int maxProductC(int arr[], int n) {

        // Variables to store maximum and minimum
        // product till ith index.
        int minVal = arr[0];
        int maxVal = arr[0];

        int maxProduct = arr[0];

        for (int i = 1; i < n; i++) {

            // When multiplied by -ve number,
            // maxVal becomes minVal
            // and minVal becomes maxVal.
            if (arr[i] < 0) {
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;

            }

            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            // Max Product of array.
            maxProduct = Math.max(maxProduct, maxVal);
        }

        // Return maximum product found in array.
        return maxProduct;
    }
}
