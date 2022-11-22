package com.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortArray {
    public static void main(String[] args) {
        int[] A = {2,1,2,5,7,1,9,3,6,8,8};
        int[] B = {2,1,8,3};
        int[] res = solve(A,B);
        System.out.println("Ans:"+ Arrays.toString(res));
    }
    public  static  int[] solve(int[] A,int[] B){
        int N =  A.length;
        int[] ans =  new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }
            else{
                map.put(A[i],map.get(A[i])+1);
            }
        }


        int M = B.length;
        for(int i=0;i<M;i++) {
            if (map.containsKey(B[i])) {
                int size = map.get(B[i]);
                for (int j = 1; j <= size; j++) {
                    list.add(B[i]);
                }
            }
            map.remove(B[i]);
        }
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(A[i])){
                int size = map.get(A[i]);
                for(int j=1;j<=size;j++) {
                    list2.add(A[i]);
                }
            }
            map.remove(A[i]);
        }
        Collections.sort(list2);
        for(int i=0;i<list2.size();i++){
            ans[i+list.size()] = list2.get(i);
        }

        return ans;
    }
}
