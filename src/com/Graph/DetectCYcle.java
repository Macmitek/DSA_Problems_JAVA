package com.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCYcle {
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    static boolean[] visisted;
    static boolean[] recStack;

    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1,2},{1,3},{2,3}, {1,4},{4,5},{3,5}};
        int res = solve(A,B);
        System.out.println("the ans is :"+res);
    }
    public static   int solve(int A, int[][] B){
        visisted = new boolean[A+1];
        recStack = new boolean[A+1];

        map = new HashMap<>();
        for(int i = 0; i < B.length; i++){

            if(!map.containsKey(B[i][0])){
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(B[i][1]);
                map.put(B[i][0], ar);
            }else{
                map.get(B[i][0]).add(B[i][1]);
            }
        }

        for(int i = 1 ; i <= A; i++){
            if(!visisted[i]){
               if(helperbfs(i,visisted,recStack)){
                   return 1;
               }
            }
        }
        return 0;
    }
    public  static  boolean helperbfs(int node, boolean[] visited, boolean[] recStack){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        recStack[node] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (map.containsKey(curr)) {
                for (int neighbor : map.get(curr)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        recStack[neighbor] = true;
                        queue.offer(neighbor);
                    } else if (recStack[neighbor]) {
                        return true; // Cycle detected
                    }
                }
            }
            recStack[curr] = false;
        }

        return false;
    }
}
