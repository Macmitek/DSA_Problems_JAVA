package com.ModularArithmetic;

import java.util.Scanner;

public class BinarytoDecimal {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = solve(str);
        System.out.println("Ans is:"+res);
    }
    public static int solve(String A){
        int res = 0;
        int base=1;
        for (int i = A.length()-1; i >=0; i--)
        {
            if(A.charAt(i)== '1'){
                System.out.println("inside if");
                res = res + base;
            }
            base = base *2;
        }
        return res;
    }
}
