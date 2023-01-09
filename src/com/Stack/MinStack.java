package com.Stack;

import java.util.Stack;

public interface MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> minstk = new Stack<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(-2);
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
        System.out.println(top());
    }
    public static void push(int x) {
        stk.push(x);
        if(minstk.isEmpty()) minstk.push(x);
        else minstk.push(Math.min(x,minstk.peek()));
    }

    public static void pop() {
        if(stk.isEmpty()) return;
        else{
            stk.pop();
            minstk.pop();
        }
    }

    public  static int top() {
        if(stk.isEmpty()) return -1;
        else
            return stk.peek();

    }

    public  static int getMin() {
        if(minstk.isEmpty()) return -1;
        else
            return minstk.peek();
    }
}
