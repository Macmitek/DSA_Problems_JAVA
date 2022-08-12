package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KOccurences {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[] C = new int[A];
            for(int i=0;i<A;i++){
                C[i] = sc.nextInt();
            }
            int res = solve(A,B,C);
            System.out.println("Ans is : " + res);
        }
        public static int solve (int A, int B, int[] C){
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < A; i++) {
                if (map.containsKey(C[i])) {
                    map.put(C[i], map.get(C[i]) + 1);
                } else {
                    map.put(C[i], 1);
                }
            }
            System.out.println(map);
            int sum = 0;
            int flag = 0;
            for(Map.Entry<Integer,Integer> set: map.entrySet()){
                if(set.getValue()==B){
                    sum = sum + set.getKey();
                    flag = 1;
                }
            }
            if(flag==0){
                return -1;
            }
            return sum%(7+1000000000);
        }
    }

