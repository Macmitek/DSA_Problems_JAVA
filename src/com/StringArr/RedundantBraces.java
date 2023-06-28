package com.StringArr;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RedundantBraces {
    public static void main(String[] args) {
        String  str = "(a+(a+b))";
        int res = solve(str);
        System.out.println("ans is :"+res);
    }
    public  static int solve(String A) {

        Stack<Character> st = new Stack<>();
        for(char ch: A.toCharArray()){
            if (ch == ')'){
                boolean ans = false;
                if(st.peek() == '('){
                    return 1;
                }
                while(st.size() > 0 ){
                    char tmp = st.peek();
                    if(tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/'){
                        ans = true;
                    }
                    st.pop();
                }
                if(!ans){
                    return 1;
                }
            } else
                st.push(ch);
            }
        return 0;
    }
}
