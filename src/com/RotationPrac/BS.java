package com.RotationPrac;

import java.util.Scanner;

public class BS {
 
        int binarySearch(int arr[], int l, int r, int x)
        {
            if (r >= l) {
                int mid = l + (r - l) / 2;
     
                if (arr[mid] == x)
                    return mid;
     
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);
     
                return binarySearch(arr, mid + 1, r, x);
            }
            int mid = l + (r - l) / 2;
            return mid;
        }
     

        public static void main(String args[])
        {
            BS ob = new BS();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int n = arr.length;
            //input element to search in array
            int x = sc.nextInt();
            
            
            int result = ob.binarySearch(arr,0, n - 1, x);
            
            
            
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index "
                                   + result);
        }
    }
