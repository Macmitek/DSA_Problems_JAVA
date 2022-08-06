package com.RotationPrac;

import java.util.Scanner;

public class RemoveElement {

 
        public static void main(String args[])
        {
            RemoveElement ob = new RemoveElement();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
         
            int x = sc.nextInt();
            
            
            int result = ob.remove(arr,x);
            System.out.println("Result is :"+result);
            
        }

    public int remove(int[] nums, int val) {
            
        int n = nums.length;
        int left = 0;
       

        for(int i=0;i<n;i++){
            if(nums[i]!=val ){
                nums[left++]=nums[i];
            }
        }
        return left;
            
        }
            
    }
