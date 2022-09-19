package com.AdvBinary;

import java.util.ArrayList;
import java.util.Scanner;

public class DiffBitsPairWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        int res = solve(A);
        System.out.println("Ans is :"+res);
    }
    public static int solve(ArrayList<Integer> A ){
        int N  = A.size();
        long sum = 0;
        for (int k = 0; k<32; k++) {
            long count = 0;
            for (int j = 0; j<N; j++) {
                if (((A.get(j) >> k) & 1) == 1){
                    count++;
                }
            }
            sum += (count * (N-count));
        }
        sum = 2 * (sum) % (1000000007);
        return (int)sum;
    }
}
/*
    public int cntBits(ArrayList<Integer> A) {
        int aSize = A.size();
        long pairSum = 0;
        int modulo = 1000 * 1000 * 1000 + 7;
        // calculation for pairs in upper triangle
        for (int i = 0; i<32; i++) {
            long setCount = 0;
            long unSetCount = 0;
            for (int j = 0; j<aSize; j++) {
                if (((A.get(j) >> i) & 1) == 1)
                    setCount++;
                else
                    unSetCount++;
            }
            pairSum += (setCount * unSetCount);
        }
        // as upper traingle pairs are same as lower triangle, multiply it with 2 instead of calculating again
        // for lower triangle.
        pairSum = (pairSum * 2) % modulo;
        return (int)(pairSum);
    }
*/