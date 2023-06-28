package com.Recursion;

public class KthNo {
    public static void main(String[] args) {
       int A = 4;
       int B = 5;
       int res =  solve(A,B);
       System.out.println("the ans is:"+res);
    }
    public static int solve(int A, int B) {
        String temp =  generateNthRow(A-1);
        System.out.println("string is :"+temp);
        char ans =  temp.charAt(B-1);
        return ans-'0';
    }
    public static String generateNthRow(int N){

        if(N==0) return "0";

        String preNrow = generateNthRow(N-1);
        StringBuilder str =  new StringBuilder();
        for(int i=0; i<preNrow.length();i++){
            if(preNrow.charAt(i)=='0'){
                str.append("01");
            }else{
                str.append("10");
            }
        }
        return str.toString();
    }
}
