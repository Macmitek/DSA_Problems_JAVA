package com.DynamicP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumpathTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > x
                = new ArrayList<ArrayList<Integer> >();

        x.add(new ArrayList<Integer>());
        x.get(0).add(0, 2);
        x.add( new ArrayList<Integer>(Arrays.asList(3, 4)));
        x.add( new ArrayList<>(Arrays.asList(6,5,7)));
        x.add(new ArrayList<Integer>( Arrays.asList(4,1,8,3)));
        System.out.println("The x is  :"+x);
        int res= solve(x);
        System.out.println("the ans is :"+res);
    }
    public  static  int solve(ArrayList<ArrayList<Integer>> A ){
//
    return 0;
    }
}
