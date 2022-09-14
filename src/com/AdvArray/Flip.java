package com.AdvArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Integer> res = solve(str);
        System.out.println("Ans is : "+res);
    }
    public static ArrayList<Integer> solve(String A){

        ArrayList<Integer> ans = new ArrayList<>();
        int N = A.length();
        int cur_sum=0,max_sum=0,left = 0,right = 0;
        for(int i=0;i<N;i++){
            if(A.charAt(i)=='0'){
                cur_sum++;
            }
            else {
                cur_sum--;
            }
            if(cur_sum>max_sum){
                ans.clear();
                max_sum = cur_sum;
                right = i +1;
                ans.add(left+1);
                ans.add(right);
            }
            if(cur_sum<0){
                cur_sum = 0;
                left = i+1;
            }
        }
    return ans;
//        int cur = 0;
//        int maxx = 0, l = 0, r = 0;
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//        ans.add(-1);
//        ans.add(-1);
//        for(int i = 0 ; i < A.length() ; i++){
//            if(A.charAt(i)=='1')
//                cur--;
//            else cur++;
//            if(cur > maxx){
//                ans.set(0, l+1);
//                ans.set(1, r+1);
//                maxx = cur;
//            }
//            if(cur < 0) {
//                cur = 0;
//                l = i+1;
//                r = i+1;
//            }
//            else r++;
//        }
//        if(maxx == 0){
//            return new ArrayList<Integer>();
//        }
//        else return ans;
    }
}
