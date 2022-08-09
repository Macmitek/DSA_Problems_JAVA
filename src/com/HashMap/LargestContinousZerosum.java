package com.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LargestContinousZerosum {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int res[] = solve(A);
        for(int i=0;i<res.length;i++){
            System.out.print(" "+res[i]);
        }

    }
    public  static int[] solve(int[] A) {
        int N = A.length;
        int[] psum = new int[N];
        psum[0] = A[0];
        for(int i=1;i<N;i++){
            psum[i] = psum[i-1] + A[i];
        }
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        set.put(0,-1);
        int first_occ = 0;
        int diff,start = 0,end = 0;
        int ans = 0;
        for(int i=0;i<N;i++){
            if(set.containsKey(psum[i])){
                first_occ = set.get(psum[i]);
                diff = i-first_occ;
                if(diff>ans){
                    start = first_occ;
                    ans =diff;
                }
            }
            else {
                    set.put(psum[i],i);
            }
        }

        if (ans==0)
        {
            return new int[]{ };
        }
        int[] arr = new int[ans];
        for(int i=0;i<ans;i++){
            ++start;
            arr[i] = A[start];
        }

        return arr;
    }
//    ArrayList<Integer> rst = new ArrayList<Integer>();
//    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        if(A == null) return rst;
//    int len = 0;
//    int sum = 0;
//    int l = -1, r = -1;
//        map.put(0, -1);
//        for(int i = 0; i < A.size(); i++){
//        sum += A.get(i);
//        if(!map.containsKey(sum))
//            map.put(sum, i);
//        else{
//            if(i - map.get(sum) > len){
//                l = map.get(sum) + 1;
//                r = i;
//                len = i - map.get(sum);
//            }
//        }
//    }
//        if(l >=0 && r >= 0){
//        for(int i = l; i <= r; i++){
//            rst.add(A.get(i));
//        }
//    }
//        return rst;
}
