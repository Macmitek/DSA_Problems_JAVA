package com.HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class ColorfulNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res =solve(N);
        System.out.println("Ans: "+res);
    }
    public static int solve(int A){
        int sum = 1,B = A;
        HashSet<Integer> set = new HashSet<Integer>();
        while(A>0){
            int temp = B%10;
            sum = sum *temp;
            if(set.contains(sum)){
                return  0;
            }
            set.add(sum);
            B = B/10;
            if(B==0){
                A=A/10;
                B=A;
                sum=1;
            }
        }
        return 1;
    }
}
