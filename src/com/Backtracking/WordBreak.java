package com.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WordBreak {
    static HashMap<String,Boolean> hm = new HashMap<>();
    public static void main(String[] args) {
        String A = "myinterviewtrainer";
        ArrayList<String> B = new ArrayList<>(Arrays.asList("trainer", "my", "interview"));
        int res = solve(A,B);
        System.out.println("the ans is :"+res);
    }
    public  static  int solve(String A, ArrayList<String> B){
        if(helper(A,B)) return 1;
        return 0;
    }

    public static boolean helper(String A, ArrayList<String> B){
        if(B.contains(A)) return  true;
        if(hm.containsKey(A)){
            return  hm.get(A);
        }
        for(int i=1;i<A.length();i++){
            String l =  A.substring(0,i);
            String r =  A.substring(i);
            if(B.contains(l) && helper(r,B)){
                hm.put(A,true);
                return true;
            }
        }
        hm.put(A,false);
        return false;
    }

}
