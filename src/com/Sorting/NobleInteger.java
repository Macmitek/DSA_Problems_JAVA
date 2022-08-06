package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter Array Elements: ");
        int[] arr = {-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2,
                -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9,
                -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4,
                -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9,
                2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10,
                -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4,
                -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1,
                -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5
        };
        int n = arr.length;
        for (int i=0;i<n;i++) {
            A.add(arr[i]);
        }
        int res = solve(A);
        System.out.println("Result is:"+res);
    }
    public  static int solve(ArrayList<Integer> A){
        int N = A.size();
        Collections.sort(A, Collections.reverseOrder());
        for (int i=0;i<N;i++) {
            System.out.println(" "+A.get(i));
        }
        if(A.get(0)==0){
            return 1;
        }
        for(int i=1;i<N;i++){
            if(A.get(i)==A.get(i-1))
                continue;
            else if(A.get(i)>0){
                if(A.get(i)==i){
                    return 1;
                }
            }

        }
        return  -1;
    }
}
