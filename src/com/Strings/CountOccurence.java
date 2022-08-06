package com.Strings;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        String str = "abobob";

        int res = solve(str);
        System.out.println("Ans is :"+res);

    }
    public static  int solve (String A){
        int N = A.length();
        int l=0;
        int count = 0;
        for(int r = 2 ; r<N;r++){
            if(A.charAt(l) == 'b' && A.charAt(l+1) == 'o' && A.charAt(r) == 'b')
            {
                count++;
            }
            l++;
        }
        return count;
    }
}
