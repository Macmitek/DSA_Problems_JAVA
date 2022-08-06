package com.Strings;

import java.util.Scanner;

public class reverseString {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String str = "miteshjadav";
        System.out.println("Entered string was: "+str);

        String res = solve(str);
        System.out.println("Ans is :"+res);
    }
    public static String solve(String A){

        StringBuilder sb = new StringBuilder();
        String[] array = A.split(" ");
        int N = array.length;

        for (int i = N - 1; i >= 0; i--) {
            if (!array[i].isEmpty()) {
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


