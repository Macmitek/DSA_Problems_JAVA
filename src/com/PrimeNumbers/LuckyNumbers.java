package com.PrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {

        int N = 12;
        int res = getLucklyNumber(N);
        System.out.println("Ans is:"+res);

    }
    public  static int getLucklyNumber(int A) {

        int[] getpf = getSieve(A);
        int ans = 0;

        for (int i=1;i<=A;i++) {
            if (getpf[i] == 2) {
                ans++;
            }
        }
        return ans;
    }

        public static int[] getSieve( int A){
            int[] count = new int[A + 1];
            for (int i = 2; i <= A; i++) {
                if (count[i] == 0) {
                    for (int j = i; j<=A; j+=i) {
                        count[j]++;
                    }
                }
            }
            return count;
        }
    }
