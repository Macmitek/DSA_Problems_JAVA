package com.ModularArithmetic;

import java.util.Scanner;

public class ABCDtoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = solve(str);
        System.out.println("Ans is:"+res);
    }
    public static int solve(String A){
        int res = 0;
        for (int i = 0; i < A.length(); i++)
        {
            res *= 26;
            res += (A.charAt(i) - 'A') + 1;
        }
        return res;

    }
}
