package com.AdvArray;

import java.util.ArrayList;
import java.util.Scanner;

public class AddonetoArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(2);
        arr.add(3);
        System.out.println("Input arraylist :"+arr);
        ArrayList<Integer> ans = solve(arr);
        System.out.println("Ans is :"+ans);
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        int N = A.size();
        int num;
        int carry = 1;
        for(int i=N-1;i>=0;i--){
            num = A.get(i);
            num = num +carry;
            carry = 0;

            if(num==10){
                carry=1;
                num = 0;
            }
            A.set(i,num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(carry==1){
            result.add(1);
        }
        for(int x  : A){
            if(x==0 && result.size() ==0){
                continue;
            }
            result.add(x);
        }
        return result;
    }
}
