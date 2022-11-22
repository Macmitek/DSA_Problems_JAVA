package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAMinimum {
    public static void main(String[] args) {
        int[] A ={ 6,8,5,3,5,7,9,10};
        int[] res = solve(A);
        System.out.println(res[0]+" "+res[1]);
    }
    public   static  int[] solve(int[] A){
        Arrays.sort(A);
        ArrayList<Integer> l1 =  new ArrayList<>();
        ArrayList<Integer> l2 =  new ArrayList<>();
        int[] ans =  new int[2];
        int N = A.length;
        for(int i=0;i<N;i++){
            if(i%2==0){
                l1.add(A[i]);
            }else{
                l2.add(A[i]);
            }
        }
        int min = 0,max = 0;
        int lsize = l1.size();
        for(int i=0;i<lsize;i++){
            min = min + Math.abs(l1.get(i)-l2.get(i));
            max = max +  Math.abs(l1.get(i)-l2.get(lsize-1-i));
        }
        ans[0] = max;
        ans[1] = min;
        return ans;
    }
}
