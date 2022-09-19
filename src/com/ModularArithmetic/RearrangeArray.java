package com.ModularArithmetic;

import java.util.ArrayList;

public class RearrangeArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(2);
        A.add(4);
        A.add(1);
        A.add(0);

        solve(A);
    }
    public static void solve(ArrayList<Integer> a){
        int n = a.size();
        for(int i=0;i<n;i++){
            a.set(i,a.get(i)+(a.get(a.get(i)%n)%n)*n);
        }
        for(int i=0;i<n;i++){
            a.set(i,a.get(i)/n);
        }
        System.out.println(a);
    }
}
