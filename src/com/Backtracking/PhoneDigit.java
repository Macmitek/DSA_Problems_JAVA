package com.Backtracking;

import com.Practise.MaxPosstemp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneDigit {
    static ArrayList<String> ans = new ArrayList<>();
    static  String phoneDigits;
    static Map<Character, String> letterMap = Collections.unmodifiableMap(new LinkedHashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }});

    public static void main(String[] args) {
        String input = "23";
        ArrayList<String> res = solve(input);
        System.out.println("the ans is "+res);
    }
    public static ArrayList<String> solve(String digits){
        if(digits.length() == 0){
            return  ans;
        }
        phoneDigits = digits;
        backtrackHelper(0,new StringBuilder());
        return ans;
    }
    public  static  void backtrackHelper(int idx, StringBuilder path){
        if(path.length() == phoneDigits.length()){
            ans.add(path.toString());
            return;
        }
        String possibleLetter = letterMap.get(phoneDigits.charAt(idx));
        for(char letter : possibleLetter.toCharArray()){
            path.append(letter);
            backtrackHelper(idx+1,path);
            path.deleteCharAt(path.length()-1);
        }
    }

}
