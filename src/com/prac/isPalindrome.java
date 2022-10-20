package com.prac;

public class isPalindrome {
    public static void main(String[] args) {
        String str = "abba";
        int res =  solve(str);
        System.out.println("Ans is: "+res);
    }
    public   static int solve(String A){
        String rev = "";
        int N = A.length();
        for(int i= N-1;i>=0;i--){
            rev = rev + A.charAt(i);
        }
        if(A.equals(rev)){
            return 1;
        }
        return 0;
    }
}
