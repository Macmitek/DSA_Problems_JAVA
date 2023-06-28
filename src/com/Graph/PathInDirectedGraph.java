package com.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PathInDirectedGraph {

    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1,2},{4,1},{2,4}, {3,4},{5,2},{1,3}};
        int res = solve(A,B);
        System.out.println("the ans is :"+res);
    }

    public  static int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList < ArrayList < Integer > > ();
        for (int i = 0; i <= A; i++) {
            adj.add(new ArrayList < Integer > ());
        }
        for (int[] edge: B)
            adj.get(edge[0]).add(edge[1]);
        int ans = isReachable(A,adj);

        return ans;
    }
    public static int isReachable(int N,ArrayList<ArrayList<Integer>> adj) {


        int indegree[] = new int[N+1];
        for(int i = 0;i<=N;i++) {
            for(Integer it: adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue< Integer > q = new ArrayDeque< >();
        for(int i = 1;i<=N;i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int cnt = 0;
        while(!q.isEmpty()) {
            Integer node = q.poll();
            cnt++;
            for(Integer it: adj.get(node)) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        if(cnt == N) return 0;
        return 1;
    }
}
