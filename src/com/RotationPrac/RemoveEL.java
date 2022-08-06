package com.RotationPrac;

import java.util.Scanner;

public class RemoveEL {

 
        public static void main(String args[])
        {
            RemoveEL ob = new RemoveEL();
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
        int i=0;

        while(i<n){

            if(nums[i]==val ){
                nums[i]=nums[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
            
        }
            
    }
