package com.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Size: ");
//        int N = sc.nextInt();
        //int A[] = new int[N];
        int A[]  =  { 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
        System.out.println("Enter Array Elements: ");

//        for (int i=0;i<N;i++) {
//            A[i] = sc.nextInt();
//        }
        System.out.println("Enter B");
        int B = sc.nextInt();
        int res[] = solve(A,B);
        System.out.println("Index1: "+res[0] +" Index2: "+res[1]);
        //System.out.println("Result is:"+res);
    }
    public static int[] solve(int[] A,int B){
        int N = A.length;
        int[] ans  = new int[2];
        int index1 = -1,index2=-1;
        HashMap<Integer,Integer>  set = new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            if(set.containsKey(B-A[i])){
                 index1 = set.get(B-A[i]);
                 ans[0] = index1 +1;
                 index2  = i ;
                 ans[1] = index2 +1;
                 break;
            }
            else if(set.containsKey(A[i])){
                continue;
            }
            else {
                set.put(A[i],i);
            }

        }
        if(ans[0]==0 || ans[1] ==0){
            return new int[]{};
        }
        return ans;
    }

}
