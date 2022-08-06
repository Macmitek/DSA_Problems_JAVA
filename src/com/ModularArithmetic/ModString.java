package com.ModularArithmetic;

import java.util.Scanner;

public class ModString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int res = findMod(str,n);
        System.out.println("Result is:"+res);
    }
    public  static int findMod(String A, int B){
        int n = A.length();
        int num,rem=0;
        for(int i=0;i<n;i++){
            num = rem*10 +(A.charAt(i)-'0');
            rem = num % B;
        }

        return rem;
    }
}
