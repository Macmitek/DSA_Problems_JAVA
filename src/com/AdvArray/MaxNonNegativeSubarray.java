package com.AdvArray;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNonNegativeSubarray {
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(5);
            arr.add(-7);
            arr.add(2);
            arr.add(3);
            System.out.println("Input arraylist :"+arr);
            ArrayList<Integer> ans = solve(arr);
            System.out.println("Ans is :"+ans);
        }
        public static ArrayList<Integer> solve(ArrayList<Integer> A){
            long max_sum=0,sum=0;
            ArrayList<Integer> max_list = new ArrayList<>(),list = new ArrayList<>();
            int n = A.size();
            for(int i=0;i<n;i++){
                if(A.get(i)>=0){
                    sum = sum + A.get(i);
                    list.add(A.get(i));
                }
                else{
                    if(max_sum < sum || ((sum == max_sum) && list.size() > max_list.size())){
                        max_sum = sum;
                        max_list = list;
                    }
                  sum = 0;
                  list = new ArrayList<>();
                }
            }
            if(max_sum < sum || ((sum == max_sum) && list.size() > max_list.size())){
                max_sum = sum;
                max_list = list;
            }
            return max_list;
        }
    }
