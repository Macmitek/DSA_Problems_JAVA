package com.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class COnstructRoad {
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    static int[] visisted;
    static int MOD = 1000000007;
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1,3},{1,4},{3,2},{3,5}};
        int res = solve(A,B);
        System.out.println("te ans jdasd  :"+res);
    }
    public  static int solve(int A, int[][] B){
        visisted = new int[A+1];
        map = new HashMap<>();

        for(int i = 0; i < B.length; i++){
//            int u = B[i][0];
//            int v = B[i][1];
//            if (!map.containsKey(u)) {
//                map.put(u, new ArrayList<>());
//            }
//            if (!map.containsKey(v)) {
//                map.put(v, new ArrayList<>());
//            }
//            map.get(u).add(v);
//            map.get(v).add(u);


                if(!map.containsKey(B[i][0])){
                    ArrayList<Integer> ar = new ArrayList<>();
                    ar.add(B[i][1]);
                    map.put(B[i][0], ar);
                }else{
                    map.get(B[i][0]).add(B[i][1]);
                }

        }
        System.out.println("MAP undirected:"+map);
        for(int i = 1 ; i <= A; i++){
            if(visisted[i] == 0){
                helperbfs(i);
            }
        }

        int a = 0;
        int b = 0;
        for(int i = 1; i <= A; i++){
            if(visisted[i] == 1){
                a++;
            }
            else{
                b++;
            }
        }
        long ans = ((long)a * b) - B.length;
        ans %= MOD;
        return (int) ans;

    }
    public  static void helperbfs(int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        int color = 1;
        visisted[i] = color;
        while(!q.isEmpty()){
            int temp = q.poll();
            color = visisted[temp] == 1 ? 2 : 1;

            if (map.get(temp) != null) {
                for(int itr : map.get(temp)){
                    if(visisted[itr] == 0){
                        visisted[itr] = color;
                        q.add(itr);
                    }
                }
            }
        }
    }
}
