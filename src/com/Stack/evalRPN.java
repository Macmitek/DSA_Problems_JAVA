package com.Stack;

import java.util.Stack;

public class evalRPN {
    public static void main(String[] args) {
        String[] A = {"2","2","/"};
        int res = solve(A);
        System.out.println("Ans is:"+res);
    }
    public static  int solve(String[] A){
        Stack<Integer> stack = new Stack<>();
        int len = A.length;
        //  if(A.length==1){
        //     return Integer.parseInt(A[0]);
        // }
        for(int i=0;i<len;i++){
            String ch=A[i];

            if(ch.equalsIgnoreCase("+") ||ch.equalsIgnoreCase("-") ||ch.equalsIgnoreCase("*") ||ch.equalsIgnoreCase("/")){

                int b = stack.peek();
                stack.pop();
                int a = stack.peek();
                stack.pop();

                if(ch.equals("+"))
                {   stack.push( a + b );
                }
                else if(ch.equals("-"))
                {   stack.push( a - b );
                }
                else if(ch.equals("*"))
                {   stack.push( a * b );
                }
                else if(ch.equals("/"))
                {   stack.push( a / b );
                }
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.peek();
    }
}

