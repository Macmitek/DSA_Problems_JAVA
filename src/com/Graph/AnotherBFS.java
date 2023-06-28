package com.Graph;

import java.util.ArrayList;
import java.util.List;

public class AnotherBFS {
    static  class Pair{
        Integer nodeVal;
        Integer weight;
        public Pair(Integer n, Integer w){
            nodeVal = n;
            weight = w;
        }
    }
    public static void main(String[] args) {
        int A = 6;
        int[][] B = {{2, 5, 1},
                {1, 3, 1},
                {0, 5, 2},
                {0, 2, 2},
                {1, 4, 1},
                {0,1,1}};
        int C = 3;
        int D = 2;
        int res = solve(A,B,C,D);
        System.out.println("The ans is  :"+res);
    }
    public static int solve(int A, int[][] B, int C, int D) {

//        for(int i=0;i<adj.size();i++){
//            for(int j=0;j<adj.get(i).size();j++){
//                System.out.print(" ,"+adj.get(i).get(j).nodeVal);
//               // System.out.print("W: "+adj.get(i).get(j).weight);
//            }
//            System.out.println();
//        }

        return 0;
    }
}
