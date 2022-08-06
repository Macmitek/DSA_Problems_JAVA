package com.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraymax {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(44);
        A.add(3);
        display(A);

    }

    public static  void display(ArrayList<Integer> A){
        ArrayList<Integer> mod = new ArrayList<Integer>();
        for(int i = 0 ;i<A.size();i++){
            for(int j = 0;j<A.size();j++){
                //System.out.println(A.get(i)+"  "+A.get(j));
                mod.add(A.get(i)%A.get(j));
            }
        }
        int maxmod = Collections.max(mod);
        System.out.println(maxmod);
    }
}
