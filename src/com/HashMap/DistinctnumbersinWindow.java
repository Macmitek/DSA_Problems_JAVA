package com.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctnumbersinWindow {
    public static void main(String[] args) {
        int[] A = {1,2,1,3,4,3};
        int B = 3;
        int[] res = solve(A,B);
        System.out.println("Ans is:"+ Arrays.toString(res));
    }
    public  static  int[] solve(int[] A,int B){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = A.length;
        for(int i=0;i<B;i++){
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }

        list.add(map.size());

        for(int i=B;i<N;i++){
            if(map.get(A[i-B])==1){
                map.remove(A[i-B]);
            }
            else{
                map.put(A[i-B],map.get(A[i-B])-1);
            }

            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
            list.add(map.size());
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

    }
}
