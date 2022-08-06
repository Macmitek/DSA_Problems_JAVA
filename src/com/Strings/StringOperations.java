package com.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "miteshjadav";
        System.out.println("Entered string was: "+str);

        String res = solve(str);
        String res1 = solve1(str);
        System.out.println("Ans is :"+res);
        System.out.println("Ans2 is :"+res1);

    }
    public static String solve(String res){
        String temp = res + res;
        String ans = temp.replaceAll("([A-Z])", "");
        char[] ch = ans.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'|| ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u'){
                ch[i]= '#';
            }
        }
        String str = String.copyValueOf(ch);
        return str;

    }
    public static String solve1(String A) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>='a' && A.charAt(i)<='z')
            {
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
                {
                    res.append("#");
                }
                else
                {
                    res.append(A.charAt(i));
                }
            }
        }
        res.append(res);
        return res.toString();
    }

}
